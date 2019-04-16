package com.woniu.rbacsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"com.woniu.rbacsystem.dao"})
public class RbacsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RbacsystemApplication.class, args);
    }

}
