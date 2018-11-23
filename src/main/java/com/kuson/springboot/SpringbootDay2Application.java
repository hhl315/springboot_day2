package com.kuson.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kuson.springboot.dao")
public class SpringbootDay2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDay2Application.class, args);
    }
}
