package com.example.demo0905.module.theBeauty;

public class TheBeauty implements IGoodBodyGirl,IGreatTemperamentGirl{

    private String name;

    public TheBeauty(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(name+"has goodLooking");
    }

    @Override
    public void niceFigure() {
        System.out.println(name+"has niceFigure");

    }

    @Override
    public void greatTemperament() {
        System.out.println(name+"has greatTemperament");

    }
}
