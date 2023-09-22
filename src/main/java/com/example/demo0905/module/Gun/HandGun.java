package com.example.demo0905.module.Gun;

public class HandGun extends AbstractGun{
    @Override
    public void shoot() {
        System.out.println("手枪射击。。。。。。");
    }

    @Override
    public void voice() {
        super.voice();
    }

    @Override
    public void light() {
        super.light();
    }
}
