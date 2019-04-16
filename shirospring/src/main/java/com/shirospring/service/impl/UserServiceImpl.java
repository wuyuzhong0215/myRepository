package com.shirospring.service.impl;

import com.shirospring.dao.UserMapper;
import com.shirospring.pojo.User;
import com.shirospring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByUsername(String username) {
        return userMapper.selectUserByUsername(username);
    }
}
