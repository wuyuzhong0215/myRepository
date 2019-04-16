package com.shirospring.realm;

import com.shirospring.pojo.User;
import com.shirospring.service.AuthService;
import com.shirospring.service.RoleService;
import com.shirospring.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private AuthService authService;


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("查看授权...!");
        //查看角色权限
        User user = (User) principalCollection.fromRealm(this.getName()).iterator().next();
        String roleName = roleService.findRolenameByUsername(user.getUserName());

        //查看角色所有权限
        List<String> perms = authService.findPerms(user.getUserName());
        Set permset= new HashSet(perms); //sys:user:delete

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addRole(roleName);
        info.setStringPermissions(permset);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        String userName = (String) authenticationToken.getPrincipal();
        User userByUsername = userService.findUserByUsername(userName);
        if (userByUsername == null){
            throw new UnknownAccountException("用户不存在");
        }
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(userByUsername, userByUsername.getPassword(),this.getName());
        //设置加密方式
        info.setCredentialsSalt(ByteSource.Util.bytes(userByUsername.getSalt()));
        return info;
    }
}
