package com.pingyrsoft.entity;

import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class UserInfo {

    private long id;
    private String name;
    private String password;
    private String email;
    private String headImageUrl;
    private Date createTime;
    private Date lastLoginTime;  //最近一次登录时间
    private Date lastQuitTime;   //最近一次推出登录时间
    private boolean isOnLine;    //账号是否在线

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImageUrl() {
        return headImageUrl;
    }

    public void setHeadImageUrl(String headImageUrl) {
        this.headImageUrl = headImageUrl;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastQuitTime() {
        return lastQuitTime;
    }

    public void setLastQuitTime(Date lastQuitTime) {
        this.lastQuitTime = lastQuitTime;
    }

    public boolean isOnLine() {
        return isOnLine;
    }

    public void setOnLine(boolean onLine) {
        isOnLine = onLine;
    }

    public UserInfo() {
    }

    public UserInfo(long id, String name, String password, String email, String headImageUrl,
                    Date createTime, Date lastLoginTime, Date lastQuitTime, boolean isOnLine) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.headImageUrl = headImageUrl;
        this.createTime = createTime;
        this.lastLoginTime = lastLoginTime;
        this.lastQuitTime = lastQuitTime;
        this.isOnLine = isOnLine;
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
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
