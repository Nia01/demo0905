package com.example.demo0905.module.abstractFactoryMethod;

public abstract class AbstractWhiteHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("白人");
    }

    @Override
    public void talk() {
        System.out.println("英语");
    }
}
