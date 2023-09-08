package com.example.demo0905.utils;


import io.swagger.annotations.ApiModel;
import org.springframework.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

@ApiModel("响应数据")
public class R extends HashMap<String,Object> {


    public R(){
        put("code",0);
        put("msg","success");
    }


    public static R ok(String msg){
        R r = new R();
        r.put("msg",msg);
        return r;
    }

    public static R ok(){
        return new R();
    }

    public R put(String key,Object value){
        super.put(key,value);
        return this;
    }

    public R putData(Object data){
        this.put("data",data);
        return this;
    }

    public static R error(){
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), "系统异常");
    }

    public static R error(String msg){
        return error(HttpStatus.INTERNAL_SERVER_ERROR.value(), msg);
    }

    public static R error(int code,String msg){
        R r = new R();
        r.put("code",code);
        r.put("msg",msg);
        return r;
    }
}
