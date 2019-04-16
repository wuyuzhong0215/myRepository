package com.wn.phoneinfo.pojo;


import java.sql.Timestamp;

public class Replies {
    private Integer id;

    private String content;

    private Timestamp replytime;

    private Integer infoid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getReplytime() {
        return replytime;
    }

    public void setReplytime(Timestamp replytime) {
        this.replytime = replytime;
    }

    public Integer getInfoid() {
        return infoid;
    }

    public void setInfoid(Integer infoid) {
        this.infoid = infoid;
    }

    @Override
    public String toString() {
        return "Replies{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", replytime=" + replytime +
                ", infoid=" + infoid +
                '}';
    }
}