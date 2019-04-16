package com.springboot.easyui.work.dao;

import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.vo.UserVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User findUser(String userName);

    List<User> queryUserByPage(@Param("currentPage") Integer currentPage,@Param("pageSize") Integer pageSize,@Param("vo") UserVO vo);
}