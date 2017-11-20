package com.pingyrsoft.dao;

import com.pingyrsoft.entity.SuggestMessage;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SuggestMessageDao {
    int newSuggestMessage(@Param("suggestMessage") SuggestMessage suggestMessage);
}
