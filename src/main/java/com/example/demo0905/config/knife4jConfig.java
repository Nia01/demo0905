package com.example.demo0905.config;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Configuration
@EnableSwagger2WebMvc
@EnableKnife4j
@ConfigurationProperties(prefix = "knife4j")
public class knife4jConfig {

//    @Value("enabled")
//    private Boolean enabled;
//
//    @Value("${groupName}")
//    private String groupName;
//
//    @Value("${basePackage}")
//    private String basePackage;

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(true)
                .apiInfo(apiInfo())
//                .groupName("分组")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo0905.module.controller"))
                .paths(PathSelectors.any())
                .build()
                .securitySchemes(security())
                .securityContexts(securityContexts());

    }


    private static final String TITLE = "0905文档-1";
    private static final String DESC = "0905文档描述";

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title(TITLE)
                .description(DESC)
                .version("1.0")
                .build();
    }


    private List<ApiKey> security() {
        return Collections.singletonList(new ApiKey("Authorization", "Authorization", "header"));
    }


    private List<SecurityContext> securityContexts() {
        List<SecurityContext> securityContexts = new ArrayList<>();
        securityContexts.add(
                SecurityContext.builder()
                        .securityReferences(defaultAuth())
                        .forPaths(PathSelectors.regex("^(?!auth).*$"))
                        .build());
        return securityContexts;
    }


    private List<SecurityReference> defaultAuth() {
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "accessEverything");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;
        List<SecurityReference> securityReferences = new ArrayList<>();
        securityReferences.add(new SecurityReference("Authorization", authorizationScopes));
        return securityReferences;
    }

}
