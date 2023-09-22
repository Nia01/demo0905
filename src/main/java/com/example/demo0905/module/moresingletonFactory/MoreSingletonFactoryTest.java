package com.example.demo0905.module.moresingletonFactory;

public class MoreSingletonFactoryTest {

    public static void main(String[] args) {

        //通过单例工厂创建多个实现单例接口的具体类的单例
        SingletonApple singletonApple = MoreSingletonFactory.createSingleton(SingletonApple.class);//单例苹果
        SingletonOrange singletonOrange = MoreSingletonFactory.createSingleton(SingletonOrange.class);//单例橘子
        System.out.println(singletonApple);
        System.out.println(singletonOrange);
    }
}
