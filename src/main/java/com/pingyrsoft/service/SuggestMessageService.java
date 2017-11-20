package com.pingyrsoft.service;

import com.pingyrsoft.entity.SuggestMessage;
import org.springframework.stereotype.Service;

@Service
public interface SuggestMessageService {
    int newSuggestMessage(SuggestMessage suggestMessage);
}
