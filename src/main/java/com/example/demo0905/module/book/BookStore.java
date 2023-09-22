package com.example.demo0905.module.book;

import java.util.ArrayList;

/**
 * 高层次
 */
public class BookStore {

    private final static ArrayList<IBook> bookList = new ArrayList<IBook>();


//    static{
//        bookList.add(new NovelBook("天龙八部","金庸",100));
//        bookList.add(new NovelBook("巴黎圣母院","雨果",200));
//        bookList.add(new NovelBook("悲惨世界","雨果",300));
//        bookList.add(new NovelBook("金瓶梅","兰陵笑笑生",400));
//    }

    static{
        bookList.add(new OffNovelBook("天龙八部","金庸",100));//打折
        bookList.add(new OffNovelBook("巴黎圣母院","雨果",200));//打折
        bookList.add(new OffNovelBook("悲惨世界","雨果",300));//打折
        bookList.add(new NovelBook("《活着》","余华",100));
        bookList.add(new ComputerBook("《设计模式之禅》","作者",100,"设计模式"));
    }


    //模拟书店买书
    public static void main(String[] args) {
        System.out.println("-----------书店卖出去的书籍记录如下：-----------");
        for(IBook book:bookList){
            System.out.println("书籍名称：" + book.getName()+"\t书籍作者：" + book.getAuthor()+ "\t书籍价格：" + book.getPrice()+"元");
        }
    }
}
