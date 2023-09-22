package com.example.demo0905.module.Gun;

public class Soldier {

    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    private void killEnemy(){
        System.out.println("士兵杀敌。。。。。。");
        gun.shoot();
    }

    public static void main(String[] args) {
        Soldier soldier = new Soldier();
        soldier.setGun(new ToyGun());
        soldier.killEnemy();
    }
}

