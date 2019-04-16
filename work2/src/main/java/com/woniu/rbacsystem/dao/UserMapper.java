package com.woniu.rbacsystem.dao;

import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUserByName(String userName);

    List<User> queryUserByPage(@Param("currentPage") Integer currentPage,@Param("pageSize") Integer pageSize,@Param("vo") UserVO vo);
}