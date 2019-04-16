package com.woniu.rbacsystem.controller;

import com.woniu.rbacsystem.pojo.Role;
import com.woniu.rbacsystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/list")
    @ResponseBody
    public List<Role> list(){
        List<Role> list = roleService.findRoles();
        return list;
    }



}
