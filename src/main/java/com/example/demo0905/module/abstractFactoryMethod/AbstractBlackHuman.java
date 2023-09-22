package com.example.demo0905.module.abstractFactoryMethod;

public abstract class AbstractBlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑人");
    }

    @Override
    public void talk() {
        System.out.println("非洲语");
    }

    //没有实现的抽象方法 需要 继承该类的类 实现
//    public abstract void doSomething();
}
