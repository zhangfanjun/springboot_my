package com.qf.thymeleaf.controller;

import com.qf.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("my")
public class MyController {
    @RequestMapping("hello")
    public String getHello(ModelMap map){
        map.put("mess","欢迎您！");
        User u1=new User(1,"name1","123");
        User u2=new User(2,"name2","123");
        User u3=new User(3,"name3","123");
        map.put("user",u1);
        List<User> list=new ArrayList<>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        map.put("list",list);
        map.put("date",new Date());
        return "Hello";
    }
}
