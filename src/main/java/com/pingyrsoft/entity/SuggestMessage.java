package com.pingyrsoft.entity;

import java.util.Date;

public class SuggestMessage {
    private String name;
    private String email;
    private String subject;
    private String content;
    private Date createTime;
    private Date handleTime;

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public SuggestMessage() {
    }

    public SuggestMessage(String name, String email, String subject, String content, Date createTime) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.content = content;
        this.createTime = createTime;
    }

    public SuggestMessage(String name, String email, String subject, String content, Date createTime, Date handleTime) {
        this.name = name;
        this.email = email;
        this.subject = subject;
        this.content = content;
        this.createTime = createTime;
        this.handleTime = handleTime;
    }


}
