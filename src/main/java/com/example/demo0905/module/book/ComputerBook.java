package com.example.demo0905.module.book;

public class ComputerBook implements IComputerBook{

    private String name;
    private String author;
    private int price;
    private String scope;

    public ComputerBook(String name, String author, int price, String scope) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.scope = scope;
    }

    @Override
    public String getScope() {
        return this.scope;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
