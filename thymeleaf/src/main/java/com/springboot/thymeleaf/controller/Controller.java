package com.springboot.thymeleaf.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.thymeleaf.pojo.Dept;
import com.springboot.thymeleaf.pojo.Emp;
import com.springboot.thymeleaf.service.DeptService;
import com.springboot.thymeleaf.service.EmpService;
import com.springboot.thymeleaf.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private EmpService empService;

    @Autowired
    private DeptService deptService;


    @RequestMapping("/toIndex")
    public ModelAndView toIndex(@RequestParam(value = "currentPage",defaultValue = "1",required = false)Integer currentPage,
                                @RequestParam(value = "pageSize",defaultValue = "5",required = false)Integer pageSize,EmpVO vo){
        ModelAndView modelAndView = new ModelAndView("index");
        List<Emp> empsByCondition = empService.findEmpsByCondition(currentPage, pageSize, vo);
        PageInfo pageInfo = new PageInfo(empsByCondition);
        modelAndView.addObject("pageInfo",pageInfo);
        List<Dept> depts = deptService.queryDepts();
        modelAndView.addObject("deptList",depts);
        modelAndView.addObject("vo",vo);
        return modelAndView;
    }
}
