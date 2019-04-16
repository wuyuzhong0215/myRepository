package com.springboot.easyui.work.service.imp;

import com.springboot.easyui.work.dao.UserMapper;
import com.springboot.easyui.work.pojo.User;
import com.springboot.easyui.work.service.UserService;
import com.springboot.easyui.work.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(User user) {
        User nowUser = userMapper.findUser(user.getUserName());
        if (nowUser!=null && nowUser.getPassword().equals(user.getPassword())){
            return nowUser;
        }
        return null;
    }

    @Override
    public List<User> findUserByPage(Integer currentPage, Integer pageSize, UserVO vo) {
        return userMapper.queryUserByPage(currentPage,pageSize,vo);
    }

    @Override
    public User checkUser(String userName) {
        return userMapper.findUser(userName);
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.insertSelective(user);
    }
}
