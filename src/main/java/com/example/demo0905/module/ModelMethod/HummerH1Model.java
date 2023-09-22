package com.example.demo0905.module.ModelMethod;

import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * 具体模板1
 */
public class HummerH1Model extends HummerModel{

    private boolean alarmFlag;

    @Override
    public void start() {
        System.out.println("悍马H1发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H1停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H1鸣笛...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马H1引擎声音是这样的...");
    }

    public void setAlarmFlag(Boolean isAlarm){
        this.alarmFlag = isAlarm;
    }

    @Override
    protected boolean isAlarm() {
        return this.alarmFlag;
    }

    //在HumanMethod的模板方法上加上final,使得模板方法不可以被覆写
//    @Override
//    public void run() {
//        System.out.println("覆写模板方法");
//    }

}
