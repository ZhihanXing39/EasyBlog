package edu.zjku.bean;

import java.sql.Timestamp;

public class Comment {
    private Integer id;
    private String username;
    private Timestamp time;
    private String content;

    public Comment() {
    }

    public Comment(Integer id, String username, Timestamp time, String content) {
        this.id = id;
        this.username = username;
        this.time = time;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
