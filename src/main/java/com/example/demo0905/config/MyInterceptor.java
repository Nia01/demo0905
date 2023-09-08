package com.example.demo0905.config;

import cn.hutool.json.JSONObject;
import cn.hutool.jwt.JWT;
import cn.hutool.jwt.JWTUtil;
import com.example.demo0905.module.Entity.UserTokenEntity;
import com.example.demo0905.module.Service.UserTokenService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class MyInterceptor implements HandlerInterceptor {

    private final UserTokenService userTokenService;

    public MyInterceptor(UserTokenService userTokenService) {
        this.userTokenService = userTokenService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader("Authorization");
        if (token!=null){
            JWT jwt = JWTUtil.parseToken(token);
            JSONObject claimsJson = jwt.getPayload().getClaimsJson();
            String uid = claimsJson.getStr("userId");
            request.setAttribute("uid",uid);
//        request.getAttribute("user",getUser(uid));
            return true;
        }
        return false;

    }
}
