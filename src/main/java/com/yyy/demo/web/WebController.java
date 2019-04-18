package com.yyy.demo.web;

import com.yyy.demo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class WebController {

   /* *///@RestController 注解相当于 @ResponseBody ＋ @Controller 合在一起的作用，
    // 如果 Web 层的类上使用了 @RestController 注解，就代表这个类中所有的方法都会以 JSON 的形式返回结果，
    // 也相当于 JSON 的一种快捷使用方式；
    @RequestMapping(value="/getUser")
    public User getUser() {
        User user=new User();
        user.setName("11");
        user.setAge(12);
        user.setPass("123456");
        return user;
    }

    @RequestMapping("/saveUser")
    public void saveUser(@Valid User user, BindingResult result) {
        System.out.println("user:"+user);
        if(result.hasErrors()) {
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list) {
                System.out.println(error.getCode()+ "-" + error.getDefaultMessage());
            }
        }
    }

}
