package com.example.demo0905.module.single2;

public class MinisterNew {

    public static void main(String[] args) {
        //有上限的单例模式：可以有多个对象（maxNumOfEmperor）
        int ministerNum = 5;//大臣数量
        for (int i = 0; i <ministerNum; i++) {
            EmperorNew emperor = EmperorNew.getInstance();
            System.out.println("第"+(i+1)+"个大臣参拜"+emperor);
            emperor.say();
        }
    }


}
