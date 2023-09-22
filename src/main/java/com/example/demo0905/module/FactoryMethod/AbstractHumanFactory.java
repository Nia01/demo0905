package com.example.demo0905.module.FactoryMethod;

/**
 *  抽象工厂类
 */
public abstract class AbstractHumanFactory {
    //Class<T>泛型：1.继承了Human的类，2.Class类型
    public abstract <T extends Human> T createHuman(Class<T> tClass);

}
