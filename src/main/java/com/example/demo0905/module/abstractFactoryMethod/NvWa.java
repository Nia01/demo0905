package com.example.demo0905.module.abstractFactoryMethod;

public class NvWa {

    public static void main(String[] args) {

        MaleFactory maleFactory = new MaleFactory();
        FemaleFactory femaleFactory = new FemaleFactory();

        Human maleBlackHuman = maleFactory.createBlackHuman();//MaleFactory继承HumanFactory,并实现createBlackHuman()
        maleBlackHuman.getColor();
        maleBlackHuman.talk();
        maleBlackHuman.getSex();

        Human maleWhiteHuman = maleFactory.createWhiteHuman();
        maleWhiteHuman.getColor();
        maleWhiteHuman.talk();
        maleWhiteHuman.getSex();

        Human femaleBlackHuman = femaleFactory.createBlackHuman();
        femaleBlackHuman.getColor();
        femaleBlackHuman.talk();
        femaleBlackHuman.getSex();

        Human femaleWhiteHuman = femaleFactory.createWhiteHuman();
        femaleWhiteHuman.getColor();
        femaleWhiteHuman.talk();
        femaleWhiteHuman.getSex();
    }
}
