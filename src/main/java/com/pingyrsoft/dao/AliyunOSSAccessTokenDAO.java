package com.pingyrsoft.dao;

import com.pingyrsoft.entity.AliyunOSSAccessToken;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AliyunOSSAccessTokenDAO {
    int add(@Param("aliyunOSSAccessToken") AliyunOSSAccessToken aliyunOSSAccessToken);
    AliyunOSSAccessToken query();
}
