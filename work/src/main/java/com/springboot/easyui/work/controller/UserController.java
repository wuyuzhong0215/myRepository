package com.springboot.easyui.work.controller;

import com.github.pagehelper.PageInfo;
import com.springboot.easyui.work.constans.SysConstant;
import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.service.UserService;
import com.springboot.easyui.work.util.Result;
import com.springboot.easyui.work.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登陆页面
     * @return
     */
    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登陆操作
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/doLogin")
    @ResponseBody
    public String doLogin(User user, HttpServletRequest request){
        // 这里用shiro
        User currentUser = userService.findUser(user);
        if (currentUser != null){
            System.out.println(SysConstant.currentUser);
            request.getSession().setAttribute(String.valueOf(SysConstant.currentUser),currentUser);
            return "success";
        }else{
            return "fail";
        }
    }

    /**
     * 跳转到用户管理
     * @return
     */
    @RequestMapping("/manager")
    public String manager(){
        return "user_manager";
    }

    //跳转到主页面
    @RequestMapping("/main")
    public String toMain(){
        return "main";
    }

    //读取User列表
    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(
            @RequestParam(value = "page",defaultValue = "1",required = false)Integer currentPage,
            @RequestParam(value = "rows",defaultValue = "5",required = false)Integer pageSize,UserVO vo
    ){
        List<User> list = userService.findUserByPage(currentPage,pageSize,vo);
        PageInfo<User> info = new PageInfo<>(list);
        Map result = new HashMap();
        result.put("total",info.getTotal());
        result.put("rows",info.getList());
        return  result;

    }

    @RequestMapping("/add")
    @ResponseBody
    public Result add(User user){
        User _user = userService.checkUser(user.getUserName());
        if (_user != null){
            return Result.error(500,"该用户名已经存在");
        }
        Integer result = userService.addUser(user);
        if (result > 0){
            return Result.success();
        }else {
            return Result.error(500,"用户添加失败");
        }
    }
}
