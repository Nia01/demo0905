package com.example.demo0905.module.proxy;

public class GamePlayerProxy implements IGamePlayer{

    private IGamePlayer player = null;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    @Override
    public void login(String user, String password) {
        this.player.login(user,password);
    }

    @Override
    public void killBoss() {
        this.player.killBoss();
    }

    @Override
    public void upGrade() {
        this.player.upGrade();
    }
}
