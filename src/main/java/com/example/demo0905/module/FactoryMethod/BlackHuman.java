package com.example.demo0905.module.FactoryMethod;

public class BlackHuman implements Human{

    @Override
    public void getColor() {
        System.out.println("黑色");
    }

    @Override
    public void talk() {
        System.out.println("非洲语");
    }

}
