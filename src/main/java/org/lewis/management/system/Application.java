package org.lewis.management.system;

import org.lewis.management.system.core.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan(basePackages = {"org.lewis.management.system.mapper"}, markerInterface = Mapper.class)
//@ServletComponentScan(basePackages = "org.lewis.management.system.common.servlet")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

