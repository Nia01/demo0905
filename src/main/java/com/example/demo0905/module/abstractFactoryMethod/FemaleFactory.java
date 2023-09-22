package com.example.demo0905.module.abstractFactoryMethod;

public class FemaleFactory implements HumanFactory{

    @Override
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
