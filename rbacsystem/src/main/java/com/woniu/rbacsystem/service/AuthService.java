package com.woniu.rbacsystem.service;

import com.woniu.rbacsystem.pojo.Auth;
import com.woniu.rbacsystem.pojo.User;

import java.util.List;

public interface AuthService {
    List<Auth> findAuthByParentId(Integer parentId, User user);
}
