package com.example.demo0905.module.builder;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder{

    BMWModel bmwModel = new BMWModel();
    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCardModel() {
        return this.bmwModel;
    }
}
