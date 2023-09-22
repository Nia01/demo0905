package com.example.demo0905.module.ModelMethod;

/**
 * 抽象模板
 */
public abstract class HummerModel {

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();

    //这里的run方法是继承该抽象类的具体类都有的方法——设计模式（模板方法）
    //run方法就是模板方法
    final public void run(){
        this.start();
        this.engineBoom();
        if (this.isAlarm()){//如果按喇叭会响，才调用this.alarm();
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm(){
        return true;
    }

}
