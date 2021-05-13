package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: lb
 * @Date: 2021/05/09/18:21
 */

@Controller
public class ModelTest1 {


    @RequestMapping("/m1/t1")
    public String test(Model model) {
        //转发
        model.addAttribute("msg", "ModelTest1");
        return "forward: /WEB-INF/jsp/test.jsp";
    }
}
