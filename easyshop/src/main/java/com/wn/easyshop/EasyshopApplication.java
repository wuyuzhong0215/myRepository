package com.wn.easyshop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wn.easyshop.dao")
public class EasyshopApplication {//启动类

    public static void main(String[] args) {
        SpringApplication.run(EasyshopApplication.class, args);
    }

}
