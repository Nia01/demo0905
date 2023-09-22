package com.example.demo0905.module.theBeauty;
//接口隔离原则（可以把一个接口拆分为多个接口）
public abstract class AbstractSearcher {

    //依赖其他接口
    protected IGreatTemperamentGirl iGreatTemperamentGirl;

    protected IGoodBodyGirl iGoodBodyGirl;

    public AbstractSearcher(IGreatTemperamentGirl iGreatTemperamentGirl, IGoodBodyGirl iGoodBodyGirl) {
        this.iGreatTemperamentGirl = iGreatTemperamentGirl;
        this.iGoodBodyGirl = iGoodBodyGirl;
    }

    public void show() {
    }

}
