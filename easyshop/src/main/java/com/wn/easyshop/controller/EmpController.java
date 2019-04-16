package com.wn.easyshop.controller;

import com.wn.easyshop.entity.Emp;
import com.wn.easyshop.service.EmpService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("emp")
public class EmpController {

    @Resource(name="empService")
    private EmpService empService;

    @RequestMapping("/login.html")
    public String login(String username,String password,Model model){
        Emp emp = empService.getEmpByNameAndPwd(username,password);
        List<Emp> users = empService.getUsers();
        System.out.println(emp);
        if(emp != null){
            model.addAttribute("emp",emp);
            model.addAttribute("emps",users);
            System.out.println("登陆成功");
            return "index";
        }else{
            System.out.println("登陆失败");
            return "redirect:/login.html";
        }
    }

}
