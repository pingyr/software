package com.pingyrsoft.service;

import com.pingyrsoft.entity.UserInfo;
import org.springframework.stereotype.Service;

@Service
public interface UserInfoService {
    int createAccount(UserInfo userInfo);
}
