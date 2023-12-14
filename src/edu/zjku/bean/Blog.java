package edu.zjku.bean;

import java.sql.Timestamp;

public class Blog {
    private Integer pid;
    private String title;
    private String text;
    private String user;
    private Timestamp time;

    public Blog() {
    }

    public Blog(Integer pid, String title, String text, String user, Timestamp time) {
        this.pid = pid;
        this.title = title;
        this.text = text;
        this.user = user;
        this.time = time;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "pid=" + pid +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", user='" + user + '\'' +
                ", time=" + time +
                '}';
    }
}
