package com.woniu.rbacsystem.service.impl;

import com.woniu.rbacsystem.dao.UserMapper;
import com.woniu.rbacsystem.pojo.User;
import com.woniu.rbacsystem.service.UserService;
import com.woniu.rbacsystem.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(User user) {
        User dbUser = userMapper.findUserByName(user.getUserName());
        //加密比较
        if(user.getPassword().equals(dbUser.getPassword())){
            return dbUser;
        }
        return null;
    }

    @Override
    public List<User> findUserByPage(Integer currentPage, Integer pageSize, UserVO vo) {

        return userMapper.queryUserByPage(currentPage,pageSize,vo);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public User checkUser(String userName) {
        return userMapper.findUserByName(userName);
    }

    @Override
    public int deleteUsers(Integer[] usersId) {
        return userMapper.deleteUsers(usersId);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }
}
