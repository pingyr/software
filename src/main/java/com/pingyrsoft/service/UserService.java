package com.pingyrsoft.service;

import com.pingyrsoft.entity.UserInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    void addUser(Long id);
    void updateUser(Long id);
    void deleteUser(Long id);
    List selecteUser(Long id);
}
