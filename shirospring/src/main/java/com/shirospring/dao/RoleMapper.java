package com.shirospring.dao;

import org.apache.ibatis.annotations.Select;

public interface RoleMapper {

    @Select("select role_name from t_role where role_id = (select role_id from t_user where user_name = #{value})")
    String selectRolenameByUsername(String username);
}
