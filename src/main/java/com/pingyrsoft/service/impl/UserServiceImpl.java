package com.pingyrsoft.service.impl;

import com.pingyrsoft.dao.UserDao;
import com.pingyrsoft.dao.UserInfoDao;
import com.pingyrsoft.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements com.pingyrsoft.service.UserService{
    @Autowired
    private UserDao userDao;

    public void addUser(Long id){

    };
    public void updateUser(Long id){

    };
    public void deleteUser(Long id){

    };
    public List selecteUser(Long id){
        return  new ArrayList();
    };

}
