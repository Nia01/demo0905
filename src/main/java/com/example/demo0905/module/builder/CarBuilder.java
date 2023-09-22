package com.example.demo0905.module.builder;

import java.util.ArrayList;

public abstract class CarBuilder{


    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCardModel();//abstract方法由继承了CarBuilder的具体车Builder实现，并返回具体汽车产品Model

}
