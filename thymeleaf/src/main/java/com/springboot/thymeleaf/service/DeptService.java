package com.springboot.thymeleaf.service;

import com.springboot.thymeleaf.pojo.Dept;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DeptService {

    List<Dept> queryDepts();
}
