package com.springboot.easyui.vo;

import java.util.Date;

public class EmpVO {

    private String ename;
    private Integer deptno;
    private Date begin;
    private Date end;

    public EmpVO() {
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public EmpVO(String ename, Integer deptno, Date begin, Date end) {
        this.ename = ename;
        this.deptno = deptno;
        this.begin = begin;
        this.end = end;
    }
}
