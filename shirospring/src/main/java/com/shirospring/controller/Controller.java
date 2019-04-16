package com.shirospring.controller;

import com.shirospring.pojo.User;
import com.shirospring.realm.CustomRealm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/login.html")
    public String toLogin(){
        return "login";
    }

    @RequestMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "redirect:/login.html";
    }

    @RequestMapping("/doLogin")
    public String doLogin(User user){
        //获取主体
        Subject subject = SecurityUtils.getSubject();
        //创建Token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try{
            //提交认证
            subject.login(usernamePasswordToken);
            System.out.println("认证成功");
        }catch (AuthenticationException e){
            e.printStackTrace();
            System.out.println("认证失败");
            return "redirect:/login.html";
        }
        return "index";
    }

    @RequestMapping("/manager")
    @ResponseBody
    @RequiresRoles(value = {"客户经理","超级管理员"},logical = Logical.AND)
    public String manager(){
        return "manager...";
    }

}
