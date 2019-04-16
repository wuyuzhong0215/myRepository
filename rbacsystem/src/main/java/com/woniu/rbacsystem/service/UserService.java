package com.woniu.rbacsystem.service;

import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.vo.UserVO;

import java.util.List;

public interface UserService {
    User findUser(User user);

    List<User> findUserByPage(Integer currentPage, Integer pageSize, UserVO vo);

    Integer addUser(User user);

    User checkUser(String userName);

    int deleteUsers(Integer[] usersId);

    int updateUser(User user);
}
