package com.shirospring.dao;

import com.shirospring.pojo.User;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("SELECT * FROM t_user where user_name = #{value}")
    User selectUserByUsername(String username);
}
