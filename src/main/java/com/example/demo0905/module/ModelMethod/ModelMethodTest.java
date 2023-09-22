package com.example.demo0905.module.ModelMethod;

public class ModelMethodTest {

    public static void main(String[] args) {
        HummerH1Model hummerH1Model = new HummerH1Model();
        hummerH1Model.setAlarmFlag(false);//h1的鸣笛可以修改
        HummerH2Model hummerH2Model = new HummerH2Model();//h2不需要鸣笛

        hummerH1Model.run();
        System.out.println("---------------------------");
        hummerH2Model.run();
    }
}
