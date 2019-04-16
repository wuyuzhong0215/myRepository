package com.springboot.thymeleaf.service.impl;

import com.springboot.thymeleaf.dao.EmpMapper;
import com.springboot.thymeleaf.pojo.Emp;
import com.springboot.thymeleaf.service.EmpService;
import com.springboot.thymeleaf.vo.EmpVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public List<Emp> findEmpsByCondition(Integer currentPage, Integer pageSize, EmpVO vo) {
        return empMapper.queryEmpsByPage(currentPage,pageSize,vo);
    }

    @Override
    public int updateEmp(Emp e) {
        return 0;
    }

    @Override
    public Emp queryEmpById(Integer empno) {
        return null;
    }
}
