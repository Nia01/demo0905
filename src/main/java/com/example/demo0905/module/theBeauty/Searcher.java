package com.example.demo0905.module.theBeauty;

public class Searcher extends AbstractSearcher{

    public Searcher(IGreatTemperamentGirl iGreatTemperamentGirl, IGoodBodyGirl iGoodBodyGirl) {
        super(iGreatTemperamentGirl, iGoodBodyGirl);
    }

    @Override
    public void show() {
        System.out.println("--------------------the beauty info:--------------------");
        if (super.iGoodBodyGirl!=null){
            super.iGoodBodyGirl.goodLooking();
            super.iGoodBodyGirl.niceFigure();
        }
        if (super.iGreatTemperamentGirl!=null){
            super.iGreatTemperamentGirl.greatTemperament();
        }
    }
}
