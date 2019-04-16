package com.springboot.easyui.dao;

import com.springboot.easyui.pojo.Emp;
import com.springboot.easyui.vo.EmpVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empno);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empno);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    public List<Emp> queryEmpsByPage(@Param("currentPage")Integer currentPage, @Param("pageSize")Integer pageSize, @Param("vo") EmpVO vo);
}