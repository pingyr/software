package com.pingyrsoft.dao;

import com.pingyrsoft.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao {
    int createAccount(@Param("userInfo") UserInfo userInfo);
}
