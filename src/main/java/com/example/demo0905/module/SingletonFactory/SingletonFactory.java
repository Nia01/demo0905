package com.example.demo0905.module.SingletonFactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/**
 * 用工厂方法生成单例
 */
public class SingletonFactory {

    private static Singleton singleton;

    static {
        try {
            Class<?> aClass = Class.forName(Singleton.class.getName());
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton =(Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Singleton getSingleton(){
        return singleton;
    }




}
