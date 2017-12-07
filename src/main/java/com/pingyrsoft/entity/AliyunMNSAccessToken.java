package com.pingyrsoft.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class AliyunMNSAccessToken extends AliyunAccessToken{
    private long id;
    private String topicRef;
    private String freeSignName;
    private String templateName;
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopicRef() {
        return topicRef;
    }

    public void setTopicRef(String topicRef) {
        this.topicRef = topicRef;
    }

    public String getFreeSignName() {
        return freeSignName;
    }

    public void setFreeSignName(String freeSignName) {
        this.freeSignName = freeSignName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public AliyunMNSAccessToken(){
        super();
    }

    public AliyunMNSAccessToken(long id, String topicRef, String freeSignName, String templateName, Date createTime) {
        this.id = id;
        this.topicRef = topicRef;
        this.freeSignName = freeSignName;
        this.templateName = templateName;
        this.createTime = createTime;
    }

    public AliyunMNSAccessToken(String endpoint, String accessKeyId, String accessKeySecret, long id, String topicRef,
                                String freeSignName, String templateName, Date createTime) {
        super(endpoint, accessKeyId, accessKeySecret);
        this.id = id;
        this.topicRef = topicRef;
        this.freeSignName = freeSignName;
        this.templateName = templateName;
        this.createTime = createTime;
    }
}
