package com.wn.phoneinfo.dao;

import com.wn.phoneinfo.pojo.Replies;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RepliesDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Replies record);

    int insertSelective(Replies record);

    Replies selectByPrimaryKey(Integer id);

    List<Replies> selectByForeignKey(Integer infoId);

    int updateByPrimaryKeySelective(Replies record);

    int updateByPrimaryKey(Replies record);
}