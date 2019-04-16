package com.springboot03.test.controller;

import com.springboot03.test.pojo.Emp;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("msg","hello thymeleaf");
        Emp emp = new Emp(13,"Tom",new Date());
        modelAndView.addObject("emp",emp);
        return modelAndView;
    }

//    public ModelAndView

    @RequestMapping("edit")
    @ResponseBody
    public String msg(String msg){
        System.out.println(msg);
        return "this message is ["+msg+"]...";
    }
}
