package com.springbootcd.test;

import com.springbootcd.test.dao.UserDAO;
import com.springbootcd.test.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

    @Autowired
    public UserDAO userDAO;

    @Test
    public void contextLoads() {
        User user = userDAO.selectByPrimaryKey(5);
        System.out.println(user.getEuUserName());
    }

}
