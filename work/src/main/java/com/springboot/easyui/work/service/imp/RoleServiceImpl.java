package com.springboot.easyui.work.service.imp;

import com.springboot.easyui.work.dao.RoleMapper;
import com.springboot.easyui.work.pojo.Role;
import com.springboot.easyui.work.service.RoleService;
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
