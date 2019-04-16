package com.wn.easyshop.service;

import com.wn.easyshop.dao.EmpMapper;
import com.wn.easyshop.entity.Emp;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    @Override
    public Emp getEmpByNameAndPwd(String username, String password) {
        Emp emp = empMapper.login(username,password);
        return emp;
    }

    @Override
    public List<Emp> getUsers() {
        return empMapper.getUsers();
    }
}
