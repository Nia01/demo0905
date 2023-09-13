package com.example.demo0905.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    private final MyInterceptor myInterceptor;

    public WebMvcConfig(MyInterceptor myInterceptor) {
        this.myInterceptor = myInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        WebMvcConfigurer.super.addInterceptors(registry);

        final List<String> excludePattern = new ArrayList<>();
        excludePattern.add("/example/user/login");
        registry.addInterceptor(myInterceptor).excludePathPatterns(excludePattern);
    }
}
