package com.example.demo0905.module.abstractFactoryMethod;

public class MaleFactory implements HumanFactory{
    @Override
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    @Override
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
}
