package com.pingyrsoft.dao;

import com.pingyrsoft.entity.UserEntity;
import com.pingyrsoft.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    void addUser(Long id);
    void updateUser(Long id);
    void deleteUser(Long id);
    List<UserEntity> selecteUser(Long id);
}
