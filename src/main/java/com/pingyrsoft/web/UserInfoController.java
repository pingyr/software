package com.pingyrsoft.web;

import com.pingyrsoft.dao.UserInfoDao;
import com.pingyrsoft.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/account")
public class UserInfoController {
    @Autowired
    private UserInfoDao userInfoDao;
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public void createAccount(UserInfo userInfo){
        int result = userInfoDao.createAccount(userInfo);
        System.out.println(result);
    }
}
