package com.lb.controller;

import com.lb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: lb
 * @Date: 2021/05/11/10:16
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * Localhost:8080/user/t1?name=xxx
     *
     * @param name
     * @return
     */
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model) {
        //1.接收前端参数
        System.out.println("name = " + name);

        //2.将返回的结果传递给前端
        model.addAttribute("msg", name);

        //3.跳转视图
        return "test";
    }

    /**
     * 前端接收的是一个对象:id,name,age
     * <p>
     * 1.接收前端用户传递的参数，判断参数的名字，假设名字直接再方法上，可以直接使用
     * 2.假设传递的是一个对象User,匹配User对象中的字段名，如果名字一致则ok,否则，匹配不到
     *
     * @return
     */
    @RequestMapping("/t2")
    public String test2(User user) {
        System.out.println(user);
        return "test";
    }

    @RequestMapping("/t3")
    public String test3(ModelMap map) {
        return "test";
    }
}
