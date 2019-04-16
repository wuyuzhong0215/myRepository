package com.springbootcd.test2.dao;

import com.springbootcd.test2.pojo.Replies;

import java.util.List;

public interface RepliesDAO {
    int deleteByPrimaryKey(Integer id);

    int insert(Replies record);

    int insertSelective(Replies record);

    Replies selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Replies record);

    int updateByPrimaryKey(Replies record);

    List<Replies> selectByForeignKey(Integer infoId);
}