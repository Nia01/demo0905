package com.example.demo0905.module.controller;


import cn.hutool.json.JSONObject;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.example.demo0905.exception.AppException;
import com.example.demo0905.module.Entity.UserEntity;
import com.example.demo0905.module.Entity.UserTokenEntity;
import com.example.demo0905.module.Service.UserService;
import com.example.demo0905.module.Service.UserTokenService;
import com.example.demo0905.module.controller.form.RegisterForm;
import com.example.demo0905.utils.R;
import com.example.demo0905.utils.SecurityUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.util.HashMap;

@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final UserTokenService userTokenService;

    public UserController(UserService userService, UserTokenService userTokenService) {
        this.userService = userService;
        this.userTokenService = userTokenService;
    }

    @ApiOperation("注册")
    @PostMapping("/register")
    public R register(@RequestBody RegisterForm registerForm) throws NoSuchAlgorithmException {
        String userName = registerForm.getUserName();
        String password = registerForm.getPassword();
        String encryptPassword = SecurityUtil.encryptPassword(password);
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(null);
        userEntity.setUserName(userName);
        userEntity.setPassword(encryptPassword);
        userEntity.setCreate_time(LocalDateTime.now());
        userEntity.setUpdate_time(LocalDateTime.now());
        userService.save(userEntity);
        return R.ok();
    }

    @ApiOperation("登录")
    @PostMapping("/login")
    public R login(@RequestBody RegisterForm registerForm){

        UserEntity userEntity = userService.lambdaQuery()
                .eq(UserEntity::getUserName, registerForm.getUserName())
                .one();
        if (userEntity==null){
            throw new AppException("用户名不存在");
        }

        String password = registerForm.getPassword();

        if (SecurityUtil.matchesPassword(password, userEntity.getPassword())){
            HashMap<String, Object> map = new HashMap<>();
            map.put("userId",userEntity.getUserId());
            String token = JWTUtil.createToken(map, "123".getBytes());

            UserTokenEntity userTokenEntity = new UserTokenEntity();
            userTokenEntity.setId(null);
            userTokenEntity.setUserId(userEntity.getUserId());
            userTokenEntity.setToken(token);
            userTokenEntity.setExpireTime(LocalDateTime.now().plusDays(7));
            userTokenService.save(userTokenEntity);
            return R.ok().putData(token);
        }

        return R.error("密码错误");
    }

    @ApiOperation("根据请求头中的token获取用户信息")
    @GetMapping("/getUserInfo")
    public R getUserInfo(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        JWT jwt = JWTUtil.parseToken(token);
        JSONObject claimsJson = jwt.getPayload().getClaimsJson();
        String uid = claimsJson.getStr("userId");

        return R.ok().putData(uid);
    }

    @ApiOperation("根据请求头中的token获取用户信息")
    @GetMapping("/getUid")
    public R getUid(){
        String uid = SecurityUtil.getUserId();
        return R.ok().putData(uid);
    }

}
