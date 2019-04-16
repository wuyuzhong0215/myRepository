package com.wn.phoneinfo.pojo;

import java.sql.Timestamp;

public class Informations {
    private Integer id;

    private String title;

    private String content;

    private Integer replycount;

    private Integer viewcount;

    private Timestamp reporttime;

    private Timestamp lastposttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getReplycount() {
        return replycount;
    }

    public void setReplycount(Integer replycount) {
        this.replycount = replycount;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Timestamp getReporttime() {
        return reporttime;
    }

    public void setReporttime(Timestamp reporttime) {
        this.reporttime = reporttime;
    }

    public Timestamp getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Timestamp lastposttime) {
        this.lastposttime = lastposttime;
    }

    @Override
    public String toString() {
        return "Informations{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", replycount=" + replycount +
                ", viewcount=" + viewcount +
                ", reporttime=" + reporttime +
                ", lastposttime=" + lastposttime +
                '}';
    }
}