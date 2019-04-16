package com.springboot.thymeleaf.service;

import com.springboot.thymeleaf.pojo.Emp;
import com.springboot.thymeleaf.vo.EmpVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmpService {

    List<Emp> findEmpsByCondition(Integer currentPage, Integer pageSize, EmpVO vo);

    int updateEmp(Emp e);

    Emp queryEmpById(Integer empno);

}


