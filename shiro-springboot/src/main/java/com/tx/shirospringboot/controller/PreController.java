package com.tx.shirospringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PreController {

    @RequestMapping("index")
    public String toIndex(){
        System.out.println("index...");
        return "index";
    }
}
