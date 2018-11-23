package com.kuson.springboot.controller;

import com.kuson.springboot.entity.User;
import com.kuson.springboot.service.UserService;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAll")
    public String getAll(Map map){
        List<User> users = userService.queryAll();
        map.put("users",users);
        return "forward:index.jsp";
    }
     @RequestMapping("/save")
    public void save(User user){
        userService.save(user);

     }

}
