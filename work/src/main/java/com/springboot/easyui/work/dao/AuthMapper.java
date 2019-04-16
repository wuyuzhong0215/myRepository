package com.springboot.easyui.work.dao;

import com.springboot.easyui.work.pojo.Auth;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AuthMapper {
    int deleteByPrimaryKey(Integer authId);

    int insert(Auth record);

    int insertSelective(Auth record);

    Auth selectByPrimaryKey(Integer authId);

    int updateByPrimaryKeySelective(Auth record);

    int updateByPrimaryKey(Auth record);

    List<Auth> queryAuthByParentId(@Param("parentId") Integer parentId,@Param("userId") Integer userId);
}