package com.springbootcd.test.pojo;

import java.util.Date;

public class User {
    private Integer euUserId;

    private String euUserName;

    private String euPassword;

    private Boolean euSex;

    private Date euBirthday;

    private String euIdentityCode;

    private String euEmail;

    private String euMobile;

    private String euAddress;

    private Boolean euStatus;

    public Integer getEuUserId() {
        return euUserId;
    }

    public void setEuUserId(Integer euUserId) {
        this.euUserId = euUserId;
    }

    public String getEuUserName() {
        return euUserName;
    }

    public void setEuUserName(String euUserName) {
        this.euUserName = euUserName;
    }

    public String getEuPassword() {
        return euPassword;
    }

    public void setEuPassword(String euPassword) {
        this.euPassword = euPassword;
    }

    public Boolean getEuSex() {
        return euSex;
    }

    public void setEuSex(Boolean euSex) {
        this.euSex = euSex;
    }

    public Date getEuBirthday() {
        return euBirthday;
    }

    public void setEuBirthday(Date euBirthday) {
        this.euBirthday = euBirthday;
    }

    public String getEuIdentityCode() {
        return euIdentityCode;
    }

    public void setEuIdentityCode(String euIdentityCode) {
        this.euIdentityCode = euIdentityCode;
    }

    public String getEuEmail() {
        return euEmail;
    }

    public void setEuEmail(String euEmail) {
        this.euEmail = euEmail;
    }

    public String getEuMobile() {
        return euMobile;
    }

    public void setEuMobile(String euMobile) {
        this.euMobile = euMobile;
    }

    public String getEuAddress() {
        return euAddress;
    }

    public void setEuAddress(String euAddress) {
        this.euAddress = euAddress;
    }

    public Boolean getEuStatus() {
        return euStatus;
    }

    public void setEuStatus(Boolean euStatus) {
        this.euStatus = euStatus;
    }
}