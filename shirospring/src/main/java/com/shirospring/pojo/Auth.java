package com.shirospring.pojo;

public class Auth {
    private Integer authId;
    private Integer authName;
    private String perms;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public Integer getAuthName() {
        return authName;
    }

    public void setAuthName(Integer authName) {
        this.authName = authName;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }
}
