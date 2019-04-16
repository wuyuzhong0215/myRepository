package com.springbootcd.test2.dao;

import com.springbootcd.test2.pojo.Information;

import java.util.List;

public interface InformationDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Information record);

    int insertSelective(Information record);

    Information selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Information record);

    int updateByPrimaryKey(Information record);

    List<Information> selectInformations();
}