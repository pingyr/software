package com.pingyrsoft.web;

import com.pingyrsoft.entity.SuggestMessage;
import com.pingyrsoft.service.SuggestMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SuggestMessageController {
    @Autowired
    private SuggestMessageService suggestMessageService;

    @RequestMapping(value = "send-message",method = RequestMethod.POST)
    public void newSuggestMessage(SuggestMessage suggestMessage){
        int result = suggestMessageService.newSuggestMessage(suggestMessage);
        System.out.println(result);
    }
}
