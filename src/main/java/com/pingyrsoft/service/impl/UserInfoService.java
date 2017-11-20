package com.pingyrsoft.service.impl;

import com.pingyrsoft.dao.UserInfoDao;
import com.pingyrsoft.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoService implements com.pingyrsoft.service.UserInfoService{
    @Autowired
    private UserInfoDao userInfoDao;
    public int createAccount(UserInfo userInfo) {
        return userInfoDao.createAccount(userInfo);
    }
}
