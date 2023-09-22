package com.example.demo0905.module.builder;

public class Client {

    public static void main(String[] args) {
        Director director = new Director();
        director.getABenzModel().run();
        System.out.println("---------------------------");
        director.getBBenzModel().run();
        System.out.println("---------------------------");
        director.getCBMWModel().run();
        System.out.println("---------------------------");
        director.getDBMWModel().run();
    }
}
