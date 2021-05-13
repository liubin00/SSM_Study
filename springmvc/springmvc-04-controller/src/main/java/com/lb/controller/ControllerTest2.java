package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: lb
 * @Date: 2021/05/09/15:22
 * <p>
 * Controller注解代表这个类会被Spring接管，这个类下的所有方法如果返回值是String,并且有具体的页面可以跳转，那么就会被视图解析器解析
 */
@Controller
public class ControllerTest2 {


    @RequestMapping("/ht2")
    public String test1(Model model) {
        model.addAttribute("msg", "ControllerTest2");
        return "test";
    }
}
