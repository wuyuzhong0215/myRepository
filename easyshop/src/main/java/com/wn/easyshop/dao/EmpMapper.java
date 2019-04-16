package com.wn.easyshop.dao;

import com.wn.easyshop.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {

    Emp login(@Param("euUserName")String euUserName,@Param("euPassword")String euPassword);

    List<Emp> getUsers();
}
