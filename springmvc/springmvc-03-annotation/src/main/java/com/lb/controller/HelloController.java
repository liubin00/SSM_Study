package com.lb.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: lb
 * @Date: 2021/05/09/12:34
 */

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String Hello(Model model) {
        //封装数据
        model.addAttribute("msg", "Hello,SpringMVC!");

        //会被视图解析器处理，返回的是一个视图
        return "hello";
    }
}
