package com.woniu.rbacsystem.service.impl;

import com.woniu.rbacsystem.dao.AuthMapper;
import com.woniu.rbacsystem.pojo.Auth;
import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthMapper authMapper;

    @Override
    public List<Auth> findAuthByParentId(Integer parentId, User user) {
        return authMapper.queryAuthByParentId(parentId,user.getUserId());
    }
}
