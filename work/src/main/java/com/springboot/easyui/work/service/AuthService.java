package com.springboot.easyui.work.service;

import com.springboot.easyui.work.pojo.Auth;
import com.springboot.easyui.work.pojo.User;

import java.util.List;

public interface AuthService {
    List<Auth> findAuthByParentId(Integer parentId, User user);
}
