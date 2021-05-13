package com.lb.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: lb
 * @Date: 2021/05/09/15:14
 * <p>
 * 只要实现了Controller接口的类，说明了这就是一个控制器了
 */
public class ControllerTest1 implements Controller {
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "Controller Test1");
        mv.setViewName("test");


        return mv;
    }
}
