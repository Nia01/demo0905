package com.example.demo0905.module.moresingletonFactory;

import com.example.demo0905.module.SingletonFactory.Singleton;

import java.lang.reflect.Constructor;


/**
 * 用工厂方法生成单例
 */
public class MoreSingletonFactory {

    private static ISingleton iSingleton;


    public static <T extends ISingleton> T createSingleton(Class<T> c){
        Class<?> aClass = null;
        try {
            aClass = Class.forName(c.getName());
            Constructor<?> constructor = aClass.getDeclaredConstructor();
            constructor.setAccessible(true);
            iSingleton =(ISingleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) iSingleton;
    }





}
