package com.example.demo0905.module.builder;

import java.util.ArrayList;

public class Director {

    private ArrayList<String> sequence = new ArrayList<String>();

    BenzBuilder benzBuilder = new BenzBuilder();
    BMWBuilder bmwBuilder = new BMWBuilder();


    public BenzModel getABenzModel(){

        this.sequence.clear();
        //ABenzModel的执行顺序
        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequence(sequence);

        return (BenzModel) this.benzBuilder.getCardModel();
    }

    public BenzModel getBBenzModel(){

        this.sequence.clear();
        //BBenzModel的执行顺序
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");

        this.benzBuilder.setSequence(sequence);

        return (BenzModel) this.benzBuilder.getCardModel();
    }

    public BMWModel getCBMWModel(){
        this.sequence.clear();
        this.sequence.add("alarm");
        this.sequence.add("start");
        this.sequence.add("stop");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCardModel();
    }

    public BMWModel getDBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.bmwBuilder.setSequence(this.sequence);
        return (BMWModel)this.bmwBuilder.getCardModel();
    }




}
