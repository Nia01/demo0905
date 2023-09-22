package com.example.demo0905.module.Gun;

public class RifleGun extends AbstractGun{

    @Override
    public void shoot() {
        System.out.println("来福枪射击。。。。");
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
