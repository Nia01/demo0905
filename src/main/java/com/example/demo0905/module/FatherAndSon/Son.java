package com.example.demo0905.module.FatherAndSon;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Son extends Father{


    //重载（Overload）
    public Collection doSomeThing(Map map){//map是接口，hashmap是实现类
        System.out.println("子类被执行。。。。。");
        return map.values();
    }

    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        HashMap<Object, Object> map = new HashMap<>();

        //这是正确的
        father.doSomeThing(map);//父类被执行。。。
        son.doSomeThing(map);//父类被执行。。。

    }
}
