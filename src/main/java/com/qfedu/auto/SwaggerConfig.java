package com.qfedu.auto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    public ApiInfo createApi (){
        return new ApiInfoBuilder().title("第六期联合项目文档").description("为了更好的荣荣团队，并模拟实战开发")
                .contact(new Contact("java1806","https://10.8.155.85","1219192817@qq.com")).build();
    }

    @Bean
    public Docket createDoc(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createApi()).select().
                apis(RequestHandlerSelectors.basePackage("com.qfedu.admin.controller")).build();
    }
}