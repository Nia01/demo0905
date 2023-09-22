package com.example.demo0905.module.theBeauty;

/**
 * 接口隔离原则，把大的接口拆分为多个接口
 */
public class TestClass {

    public static void main(String[] args) {

        TheBeauty susun = new TheBeauty("苏珊");

//        Searcher searcher = new Searcher(susun,null);
        Searcher searcher = new Searcher(null,susun);

        searcher.show();

    }
}
