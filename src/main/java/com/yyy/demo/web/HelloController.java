package com.yyy.demo.web;

import com.yyy.demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/thymeleaf")
    public String index(ModelMap map) {
        map.addAttribute("message", "http://www.ityouknow.com");
        return "thymeleaf";
    }
    @RequestMapping("/list")
    public String list(ModelMap map) {
        map.addAttribute("users", getUserList());
        return "thymeleaf";
    }
    private List<User> getUserList(){
        List<User> list=new ArrayList<User>();
        User user1=new User();
        user1.setName("大牛");
        user1.setAge(12);
        user1.setPass("123456");
        User user2=new User();
        user2.setName("小牛");
        user2.setAge(12);
        user2.setPass("123456");
        User user3=new User();
        user3.setName("纯洁的微笑");
        user3.setAge(12);
        user3.setPass("123456");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return  list;
    }
}