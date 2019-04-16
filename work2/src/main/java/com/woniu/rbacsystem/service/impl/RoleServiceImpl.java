package com.woniu.rbacsystem.service.impl;

import com.woniu.rbacsystem.dao.RoleMapper;
import com.woniu.rbacsystem.pojo.Role;
import com.woniu.rbacsystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;
    @Override
    public List<Role> findRoles() {
        return roleMapper.queryRoles();
    }
}
