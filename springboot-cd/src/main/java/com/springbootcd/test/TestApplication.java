package com.springbootcd.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@PropertySource(value = "classpath:myconfig.properties")//需要加载自定义配置文件时配置，指定自定义配置文件的位置
@MapperScan(value = "com.springbootcd.test.dao")//配置mybatis扫描的dao层路径
public class TestApplication {

    //启动SpringBoot应用项目，启动后，会根据项目中依赖的配置来加载内嵌的web容器
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

}
