package com.example.demo0905.module.proxy;

public class Client {
    public static void main(String[] args) {

        //普通
        IGamePlayer player = new GamePlayer("张三");
        player.login("张三","123");
        player.killBoss();
        player.upGrade();

        //代理模式
        System.out.println("-------------代理模式---------------------");
        IGamePlayer player2 = new GamePlayer("李四");
        GamePlayerProxy proxy = new GamePlayerProxy(player2);
        //由 代理 在打游戏
        proxy.login("李四","123");
        proxy.killBoss();
        proxy.upGrade();
    }
}
