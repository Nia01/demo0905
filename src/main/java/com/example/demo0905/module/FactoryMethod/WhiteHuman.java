package com.example.demo0905.module.FactoryMethod;

public class WhiteHuman implements Human{
    @Override
    public void getColor() {
        System.out.println("白色");
    }

    @Override
    public void talk() {
        System.out.println("英语");
    }
}
