package com.lb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author: lb
 * @Date: 2021/05/13/13:01
 */
@Controller
@RequestMapping("user")
public class LoginController {

    @RequestMapping("/main")
    public String main(String username, String password, HttpSession session) {
        //把用户的信息存在session中:
        session.setAttribute("userLoginInfo", username);
        return "main";
    }

    @RequestMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @RequestMapping("/hello")
    public String main() {
        return "main";
    }
}
