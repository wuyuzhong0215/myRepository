package com.springboot.easyui.work.service.imp;

import com.springboot.easyui.work.dao.AuthMapper;
import com.springboot.easyui.work.pojo.Auth;
import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.service.AuthService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private AuthMapper authMapper;

    @Override
    public List<Auth> findAuthByParentId(Integer parentId, User user) {
        return authMapper.queryAuthByParentId(parentId, user.getUserId());
    }
}
