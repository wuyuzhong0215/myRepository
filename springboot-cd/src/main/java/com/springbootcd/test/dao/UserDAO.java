package com.springbootcd.test.dao;

import com.springbootcd.test.pojo.User;

public interface UserDAO {
    int deleteByPrimaryKey(Integer euUserId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer euUserId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}