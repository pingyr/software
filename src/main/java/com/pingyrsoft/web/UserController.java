package com.pingyrsoft.web;



import com.pingyrsoft.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/account")
public class UserController {
    @Autowired
    private UserDao userDao;

    @ResponseBody
    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public void add(Long id){
        userDao.addUser(id);
    }

    @ResponseBody
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public void update(Long id){
        userDao.updateUser(id);
    }

    @ResponseBody
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public void delete(Long id){
        userDao.deleteUser(id);
    }
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public void list(Long id){
        userDao.selecteUser(id);
    }
}
