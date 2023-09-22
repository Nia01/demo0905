package com.example.demo0905.module.single2;

import java.util.ArrayList;
import java.util.Random;

/**
 * 有上线的单例模式
 */
public class EmperorNew {
    private static int maxNumOfEmperor = 2;
    private static ArrayList<String> nameList = new ArrayList<String>();
    private static ArrayList<EmperorNew> emperorList = new ArrayList<EmperorNew>();
    private static int countNumOfEmperor = 0;


    //产生所有对象
    static {
        for (int i = 0; i < maxNumOfEmperor; i++) {
            emperorList.add(new EmperorNew("皇帝"+(i+1)));
        }
    }
//    private static final Emperor emperor = new Emperor();

    private EmperorNew(){

    }

    private EmperorNew(String name){
        nameList.add(name);
    }

    //随机获取一个皇帝
    public static EmperorNew getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        System.out.println();
        return emperorList.get(countNumOfEmperor);
    }

    public void say(){
        System.out.println(nameList.get(countNumOfEmperor));
    }

}
