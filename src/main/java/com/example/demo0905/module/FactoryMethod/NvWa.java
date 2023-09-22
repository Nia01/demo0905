package com.example.demo0905.module.FactoryMethod;

public class NvWa {

    //抽象工厂方法：只有一个工厂
    public static void main(String[] args) {

        AbstractHumanFactory humanFactory = new HumanFactory();//抽象工厂方法
        WhiteHuman whiteHuman = humanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        BlackHuman blackHuman = humanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        YellowHuman yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }

}
