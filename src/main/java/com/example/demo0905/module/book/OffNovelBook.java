package com.example.demo0905.module.book;

public class OffNovelBook extends NovelBook{

    public OffNovelBook(String name, String author, int price) {
        super(name, author, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getAuthor() {
        return super.getAuthor();
    }

    @Override
    public int getPrice() {
        return super.getPrice()*80/100;
    }
}
