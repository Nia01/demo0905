package com.example.demo0905.module.builder;

import java.util.ArrayList;

public class BuilderTest {

//    public static void main(String[] args) {
//        BenzModel benzModel = new BenzModel();
//        ArrayList<String> sequence = new ArrayList<>();
//
//        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
//        sequence.add("start"); //启动起来
//        sequence.add("stop"); //开了一段就停下来
//
//        benzModel.setSequence(sequence);
//
//        benzModel.run();
//    }


    /**
     * 加入了Builder的测试
     * @param args
     */
    public static void main(String[] args) {
        ArrayList<String> sequence = new ArrayList<>();

        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来

        //建造者函数
        BenzModel benzModel = (BenzModel) new BenzBuilder().getCardModel();
        benzModel.setSequence(sequence);
        benzModel.run();

        BMWModel bmwModel = (BMWModel) new BMWBuilder().getCardModel();
        bmwModel.setSequence(sequence);
        bmwModel.run();

    }
}
