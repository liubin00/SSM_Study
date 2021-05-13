package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: lb
 * @Date: 2021/05/11/10:39
 */
@Controller
public class EncodingController {

    /**
     * 过滤器解决乱码
     *
     * @param name
     * @param model
     * @return
     */
    @PostMapping("/e/t1")
    public String test1(@RequestParam("name") String name, Model model) {
        System.out.println("name = " + name);
        model.addAttribute("msg", name);
        return "test";
    }
}
