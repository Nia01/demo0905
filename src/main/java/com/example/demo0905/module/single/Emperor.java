package com.example.demo0905.module.single;

/**
 * 单例模式
 * 饿汉式
 */
public class Emperor{
    private static final Emperor emperor = new Emperor();

    private Emperor(){

    }

    public static Emperor getInstance(){
        return emperor;
    }

    public void say(){
        System.out.println("平身");
    }

}
