package com.shirospring.service;

import com.shirospring.pojo.User;

public interface UserService {
    User findUserByUsername(String username);
}
