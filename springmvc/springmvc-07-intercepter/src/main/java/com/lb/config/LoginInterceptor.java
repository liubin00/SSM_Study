package com.lb.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author: lb
 * @Date: 2021/05/13/13:10
 */
public class LoginInterceptor implements HandlerInterceptor {

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //放行：判断什么情况下是登录的
        HttpSession session = request.getSession();

        //登录页面也会放行
        if (request.getRequestURI().contains("Login")) {
            return true;
        }

        if (request.getRequestURI().contains("login")) {
            return false;
        }
        if (session.getAttribute("userLoginInfo") != null) {
            return true;
        }

        //判断什么情况下没有登录
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
