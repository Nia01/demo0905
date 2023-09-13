package com.example.demo0905.module.spingDemo;

public class SmsNotification implements NotificationSender{
    @Override
    public String send(String message) {
        return "SmsNotification:" + message;
    }
}
