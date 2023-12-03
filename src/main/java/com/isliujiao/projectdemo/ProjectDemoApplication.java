package com.isliujiao.projectdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.*.mapper")
public class ProjectDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDemoApplication.class, args);
    }

}
