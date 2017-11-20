package com.pingyrsoft.entity;


import java.util.Date;

public class UserInfo {

    private long id;
    private Integer uId;
    private String name;
    private String password;
    private Integer gender;
    private int age;
    private String email;
    private Integer inviteCode;
    private String headImageUrl;
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(Integer inviteCode) {
        this.inviteCode = inviteCode;
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

    public UserInfo() {
    }

    public UserInfo(String name, String password, String email, Integer inviteCode, Date createTime) {
        this.name = name;
        this.password = password;
        this.email = email;
        this.inviteCode = inviteCode;
        this.createTime = createTime;
    }

    public UserInfo(Integer uId, String name, String password, String email, Integer inviteCode, Date createTime) {
        this.uId = uId;
        this.name = name;
        this.password = password;
        this.email = email;
        this.inviteCode = inviteCode;
        this.createTime = createTime;
    }

    public UserInfo(long id, Integer uId, String name, String password, Integer gender, int age, String email,
                    Integer inviteCode, String headImageUrl, Date createTime) {
        this.id = id;
        this.uId = uId;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.inviteCode = inviteCode;
        this.headImageUrl = headImageUrl;
        this.createTime = createTime;
    }
}
