package com.pingyrsoft.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;
@Repository
public class AliyunOSSAccessToken extends AliyunAccessToken {

    private long id;
    private Date createTime;



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public AliyunOSSAccessToken() {
        super();
    }

    public AliyunOSSAccessToken(String endpoint, String accessKeyId, String accessKeySecret) {
        super(endpoint, accessKeyId, accessKeySecret);
    }


    @Override
    public String getEndpoint() {
        return super.getEndpoint();
    }

    @Override
    public void setEndpoint(String endpoint) {
        super.setEndpoint(endpoint);
    }

    @Override
    public String getAccessKeyId() {
        return super.getAccessKeyId();
    }

    @Override
    public void setAccessKeyId(String accessKeyId) {
        super.setAccessKeyId(accessKeyId);
    }

    @Override
    public String getAccessKeySecret() {
        return super.getAccessKeySecret();
    }

    @Override
    public void setAccessKeySecret(String accessKeySecret) {
        super.setAccessKeySecret(accessKeySecret);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
