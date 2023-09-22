package com.example.demo0905.module.Gun;

public abstract class AbstractToy extends AbstractGun{

    private Boolean isToy;

    @Override
    public void voice() {
        System.out.println("toy voice");
    }

    @Override
    public void light() {
        System.out.println("toy light");
    }

    public AbstractToy() {

    }



}
