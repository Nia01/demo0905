package com.example.demo0905.module.controller;


import com.example.demo0905.module.Entity.UserEntity;
import com.example.demo0905.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ServiceLoader;


@Slf4j
@Api(tags = "时间")
@RestController
@RequestMapping("/time")
public class TimeController {

    @ApiOperation("当前时间")
    @GetMapping("/getTime")
    public R getTime(){

        LocalDateTime now = LocalDateTime.now();
        return R.ok().putData(now);
    }

    @ApiOperation("获取对象")
    @GetMapping("/getUser")
    public UserEntity getUser(){

        UserEntity userEntity = new UserEntity();

        userEntity.setUserName("花花");
        userEntity.setPassword("123");
        return userEntity;
    }

    public static void main(String[] args) throws IOException {
        Thread thread = Thread.currentThread();
        ClassLoader contextClassLoader = thread.getContextClassLoader();
    }


}
