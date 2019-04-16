package com.springboot.thymeleaf.service.impl;

import com.springboot.thymeleaf.dao.DeptMapper;
import com.springboot.thymeleaf.pojo.Dept;
import com.springboot.thymeleaf.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> queryDepts() {
        return deptMapper.queryDepts();
    }
}
