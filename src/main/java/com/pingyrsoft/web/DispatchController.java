package com.pingyrsoft.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pingyr on 2017/7/10.
 */
@Controller
public class DispatchController {
    /**
     *
     * @return 首页
     */
    @RequestMapping("/home")
    public String home(){
        return "../../index";
    }
    @RequestMapping("/generic")
    public String generic(){
        return "generic";
    }

    /**
     *
     * @return 与我联系
     */
    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/elements")
    public String elements(){
        return "elements";
    }

    /**
     *
     * @return 注册会员
     */
    @RequestMapping("/signUp")
    public String signUp(){
        return "signUp";
    }

    /**
     *
     * @return 会员登陆
     */
    @RequestMapping("/signIn")
    public String signIn(){
        return "signIn";
    }
}
