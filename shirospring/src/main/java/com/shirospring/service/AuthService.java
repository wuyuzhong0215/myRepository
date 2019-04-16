package com.shirospring.service;

import java.util.List;

public interface AuthService {

    List<String> findPerms(String userName);
}
