package com.springbootcd.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Value("${myapp.name}")
    private String appName;

    @Value("${myapp.version}")
    private String appVersion;

    @RequestMapping("/totest")
    @ResponseBody
    public String testConfig(){
        System.out.println(appName);
        System.out.println(appVersion);
        return "hello spring boot by testConfig...";
    }
}
