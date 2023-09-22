package com.example.demo0905.module.ModelMethod;


/**
 * 具体模板2
 */
public class HummerH2Model extends HummerModel{


    @Override
    public void start() {
        System.out.println("悍马H2发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马H2停车...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override   
    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }


    @Override
    protected boolean isAlarm() {//HummerH2Model汽车按喇叭不需要响
        return false;
    }

    //这些方法都是继承抽象类的方法，子类会对父类产生影响
}
