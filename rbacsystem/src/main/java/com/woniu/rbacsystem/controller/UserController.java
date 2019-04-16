package com.woniu.rbacsystem.controller;

import com.github.pagehelper.PageInfo;
import com.woniu.rbacsystem.constant.SysConstant;
import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.service.UserService;
import com.woniu.rbacsystem.utils.Result;
import com.woniu.rbacsystem.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {


    @Autowired
    private UserService userService;

    @RequestMapping("/doLogin")
    @ResponseBody
    public String doLogin(User user, HttpSession session){
        //shiro  session
        User currentUser = userService.findUser(user);
        if(currentUser != null){
            session.setAttribute(SysConstant.CURRENT_USER,currentUser);
            return "success";
        }
        return "fail";
    }


    @RequestMapping("/manager")
    public String manager(){
        return "user_manager";
    }

    @RequestMapping("/list")
    @ResponseBody
    public Map<String,Object> list(@RequestParam(value = "page",defaultValue = "1",required = false)Integer currentPage,
                                   @RequestParam(value="rows",defaultValue = "5",required = false)Integer pageSize, UserVO vo){
        List<User> list = userService.findUserByPage(currentPage,pageSize,vo);
        PageInfo<User> pageInfo = new PageInfo<>(list);
        Map result = new HashMap();
        result.put("total",pageInfo.getTotal());
        result.put("rows",pageInfo.getList());
        return result;
    }


    @RequestMapping("/add")
    @ResponseBody
    public Result add(User user){
        User _user = userService.checkUser(user.getUserName());
        if(_user != null){
            return Result.error(500,"该用户名已经存在");
        }
        Integer result = userService.addUser(user);
        if(result>0){
            return Result.success();
        }else{
            return Result.error(500,"用户添加失败");
        }
    }

    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(String userIds){
        String[] arr = userIds.split(",");
        Integer[] usersId = new Integer[arr.length];
        for (int i = 0;i<arr.length;i++) {
            usersId[i] = Integer.parseInt(arr[i]);
        }
        int result = userService.deleteUsers(usersId);
        if(result>0){
            return Result.success(0,"删除"+result+"条数据成功");
        }else{
            return Result.error(500,"删除数据失败");
        }
    }

    @RequestMapping("/update")
    @ResponseBody
    public Result update(User user){
        //修改用户名不能出现重复
        User _user = userService.checkUser(user.getUserName());
        if(_user != null){
            if(!_user.getUserId().equals(user.getUserId())){
                return Result.error(500,"该用户名已经存在不能修改");
            }
        }
        //修改
        int result = userService.updateUser(user);
        if(result>0){
            return Result.success();
        }else{
            return Result.error(500,"更新失败");
        }

    }


}
