package com.example.demo.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .apiInfo(apiInfo()).select()
                    //扫描指定包中的swagger注解
                    //.apis(RequestHandlerSelectors.basePackage("com.xia.controller"))
                    //扫描所有有注解的api，用这种方式更灵活
                    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                    .paths(PathSelectors.any())
                    .build();
        }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("开放接口API")  //粗标题
                .description("HTTP对外开放接口")   //描述
                .version("1.0.0")   //api version
                .termsOfServiceUrl("http://localhost:9999/swagger-ui.html")
                .license("LICENSE")   //链接名称
                .build();
    }

}