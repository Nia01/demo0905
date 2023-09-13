package com.example.demo0905.module.spingDemo;


import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ConfigurationProperties(prefix = "notification")
//@EnableConfigurationProperties(value = NotificationProperty.class)
public class BeanDemo {

    @Bean(name = "emailNotification")
    @ConditionalOnProperty(prefix = "notification",name = "service")//在配置文件yml中只要有notification：service： 就会注册名为emailNotification的这个bean
    public NotificationSender notificationSender(){
        return new EmailNotification();
    }


    @Bean(name = "smsNotification")
    @ConditionalOnProperty(prefix = "notification",name = "service",havingValue = "sms")//在配置文件yml中必须有notification：service：sms,才会注册名为smsNotification的这个bean
    public NotificationSender notificationSender2(){
        return new SmsNotification();
    }

}
