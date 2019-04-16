package com.shirospring.service.impl;

import com.shirospring.dao.RoleMapper;
import com.shirospring.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public String findRolenameByUsername(String username) {
        System.out.println("findRolenameByUserName....");
        return roleMapper.selectRolenameByUsername(username);
    }
}
