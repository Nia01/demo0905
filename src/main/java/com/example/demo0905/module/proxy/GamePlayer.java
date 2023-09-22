package com.example.demo0905.module.proxy;

public class GamePlayer implements IGamePlayer{

    private String name = "";

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("姓名："+ user + ",密码：" + password +";登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "打boss");
    }

    @Override
    public void upGrade() {
        System.out.println(this.name + "升级");
    }
}
