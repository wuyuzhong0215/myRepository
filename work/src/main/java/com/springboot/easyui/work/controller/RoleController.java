package com.springboot.easyui.work.controller;

import com.springboot.easyui.work.pojo.Role;
import com.springboot.easyui.work.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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
