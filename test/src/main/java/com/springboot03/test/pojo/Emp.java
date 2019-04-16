package com.springboot03.test.pojo;

import java.util.Date;

public class Emp {

    private Integer empId;
    private String empName;
    private Date birthday;

    public Emp() {
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Emp(Integer empId, String empName, Date birthday) {
        this.empId = empId;
        this.empName = empName;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
