package com.lb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: lb
 * @Date: 2021/05/09/12:08
 */
public class HelloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "Hello Spring MVC";

        mv.addObject("msg", result);

        //视图跳转
        mv.setViewName("test");


        return mv;
    }
}
