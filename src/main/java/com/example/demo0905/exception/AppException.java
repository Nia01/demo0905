package com.example.demo0905.exception;

import org.omg.CORBA.*;
import org.omg.CORBA.Object;
import org.omg.SendingContext.RunTime;

/**
 * 自定义异常
 */
public class AppException extends RuntimeException {

    private String msg;

    private int code = 500;

    public AppException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public AppException(String msg,int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public AppException(String msg,int code,Throwable e) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

}
