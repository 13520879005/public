package com.yyy.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class WelcomeController {

    @GetMapping("/welcome")
    public String welcome(Map<String, Object> map) {
        map.put("time", new Date());
        map.put("message", "hello world");
        System.out.print("111111111111111111111111111111111111111111111111111");
        return "welcome";
    }

}
