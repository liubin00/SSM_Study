package com.lb.controller;

import com.lb.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/13/10:33
 */
@RestController
public class AjaxController {
    @RequestMapping("t1")
    public String test() {
        return "Hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("lb".equals(name)) {
            response.getWriter().println(true);
        } else {
            response.getWriter().println(false);
        }
    }


    @RequestMapping("/a2")
    public List<User> a2() {
        ArrayList<User> list = new ArrayList<User>();
        //添加数据
        list.add(new User("lb", 1, "java"));
        list.add(new User("lb1", 2, "java2"));
        return list;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = "";
        if (name != null) {
            //amdin 应该在数据库中查
            if ("admin".equals(name)) {
                msg = "ok";
            } else {
                msg = "用户名有误";
            }
        }
        if (pwd != null) {
            //amdin 应该在数据库中查
            if ("123456".equals(pwd)) {
                msg = "ok";
            } else {
                msg = "密码输入有误";
            }
        }
        return msg;
    }
}
