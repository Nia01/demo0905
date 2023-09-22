package com.example.demo0905.module.builder;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();

    @Override
    public CarModel getCardModel() {
        return this.benzModel;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }
}
