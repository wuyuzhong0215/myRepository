package com.shirospring.service.impl;

import com.shirospring.dao.AuthMapper;
import com.shirospring.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthMapper authMapper;

    @Override
    public List<String> findPerms(String userName) {
        return authMapper.selectPerms(userName);
    }
}
