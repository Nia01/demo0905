package com.example.demo0905.module.single;

public class Minister {

    public static void main(String[] args) {
        //单例模式：大臣连续三天见的都是同一个皇上
        for (int day = 0; day <3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }

}
