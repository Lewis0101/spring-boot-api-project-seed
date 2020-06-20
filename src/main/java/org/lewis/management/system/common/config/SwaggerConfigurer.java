package org.lewis.management.system.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : LiuYang
 * @date : 2020/3/30
 */
@EnableSwagger2
@Configuration
public class SwaggerConfigurer {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("org.lewis.management.system.controller"))
                .paths(PathSelectors.any())
                .build().apiInfo(apiInfo());
    }

    public ApiInfo apiInfo(){
        return  new ApiInfoBuilder()
                .title("人事管理系统")
                .description("人事管理系统v1.0")
                .version("v1.0")
                .contact(new Contact("lewis","https://blog.csdn.net/Lewis_0101","1005859278@qq.com"))
                .build();
    }
}
