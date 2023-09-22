package com.example.demo0905.module.SingletonFactory;

public class SingletonFactoryTest {

    public static void main(String[] args) {
        //通过单例工厂创建一个单例
        Singleton singleton = SingletonFactory.getSingleton();
        System.out.println(singleton);

    }
}
