package com.example.demo0905.module.Gun;

public class Snipper {

    private AUG aug;

    private void setRifle(AUG aug){
        this.aug = aug;
    }

    private void killEnemy(){
        aug.zoomOut();
        aug.shoot();
        System.out.println("杀死敌人。。。。");
    }

    public static void main(String[] args) {
        Snipper snipper = new Snipper();
        snipper.setRifle(new AUG());
        snipper.killEnemy();
    }
}
