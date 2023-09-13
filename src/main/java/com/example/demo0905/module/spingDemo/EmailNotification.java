package com.example.demo0905.module.spingDemo;

public class EmailNotification implements NotificationSender{

    @Override
    public String send(String message) {
        return "EmailNotification :" + message;
    }
}
