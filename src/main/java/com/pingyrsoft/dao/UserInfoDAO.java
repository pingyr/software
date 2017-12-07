package com.pingyrsoft.dao;

import com.pingyrsoft.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDAO {
    int addAccount(@Param("userInfo")UserInfo userInfo);
    UserInfo queryAccountByName(String name);
}
