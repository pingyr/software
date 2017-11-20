package com.pingyrsoft.web;

import com.pingyrsoft.dao.UserInfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping(value = "/account")
public class UserInfoController {
    @Autowired
    private UserInfoDao userInfoDao;

}
