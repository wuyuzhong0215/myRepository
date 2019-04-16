package com.wn.phoneinfo.dao;

import com.wn.phoneinfo.pojo.Informations;

import java.util.List;

public interface InformationsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Informations record);

    int insertSelective(Informations record);

    Informations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Informations record);

    int updateByPrimaryKey(Informations record);

    List<Informations> selectInformations();
}