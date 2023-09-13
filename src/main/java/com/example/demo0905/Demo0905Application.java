package com.example.demo0905;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo0905Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(Demo0905Application.class, args);
        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();

//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }

    }

}
