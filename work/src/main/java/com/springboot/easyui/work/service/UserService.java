package com.springboot.easyui.work.service;

import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.vo.UserVO;

import java.util.List;

public interface UserService {
    User findUser(User user);

    List<User> findUserByPage(Integer currentPage, Integer pageSize, UserVO vo);

    User checkUser(String userName);

    Integer addUser(User user);
}
