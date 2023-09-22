package com.example.demo0905.module.lazyInitialization;

public class ProductFactoryTest {


    //延迟加载的工厂类
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("product1");
        System.out.println(product1);//ConcreteProduct1

        Product product = ProductFactory.createProduct("1");
        System.out.println(product);//ConcreteProduct1

    }
}
