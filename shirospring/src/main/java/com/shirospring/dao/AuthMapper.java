package com.shirospring.dao;

import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AuthMapper {

    @Select("select perms from t_auth where auth_id in (SELECT SUBSTRING_INDEX(SUBSTRING_INDEX((select auth_ids from t_role where role_id = (select role_id from t_user where user_name = #{value})),',',auth_id),',',-1) AS num FROM t_auth WHERE auth_id  < LENGTH((select auth_ids from t_role where role_id = (select role_id from t_user where user_name = #{value})))-LENGTH(REPLACE((select auth_ids from t_role where role_id = (select role_id from t_user where user_name = #{value})),',',''))+2) ")
    List<String> selectPerms(String userName);
}
