package com.example.demo0905.module.controller;


import com.example.demo0905.utils.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@Api("时间")
@RestController
@RequestMapping("/time")
public class TimeController {

    @ApiOperation("当前时间")
    @GetMapping("/getTime")
    public R getTime(){

        LocalDateTime now = LocalDateTime.now();
        return R.ok().putData(now);
    }
}
