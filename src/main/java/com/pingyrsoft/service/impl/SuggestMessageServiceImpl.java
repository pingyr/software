package com.pingyrsoft.service.impl;

import com.pingyrsoft.dao.SuggestMessageDao;
import com.pingyrsoft.entity.SuggestMessage;
import com.pingyrsoft.service.SuggestMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuggestMessageServiceImpl implements SuggestMessageService{

    @Autowired
    private SuggestMessageDao suggestMessageDao;

    public int newSuggestMessage(SuggestMessage suggestMessage) {
        return suggestMessageDao.newSuggestMessage(suggestMessage);
    }
}
