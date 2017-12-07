package com.pingyrsoft.dao;

import com.pingyrsoft.entity.AliyunMNSAccessToken;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AliyunMNSAccessTokenDAO {
    int add(@Param("aliyunMNSAccessToken")AliyunMNSAccessToken aliyunMNSAccessToken);
    AliyunMNSAccessToken query();
}
