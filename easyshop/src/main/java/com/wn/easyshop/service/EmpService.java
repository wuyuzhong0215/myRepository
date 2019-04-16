package com.wn.easyshop.service;

import com.wn.easyshop.entity.Emp;

import java.util.List;

public interface EmpService {

    Emp getEmpByNameAndPwd(String username, String password);

    List<Emp> getUsers();
}
