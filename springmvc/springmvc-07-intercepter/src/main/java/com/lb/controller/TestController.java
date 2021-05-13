package com.lb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lb
 * @Date: 2021/05/13/12:43
 */
@RestController
public class TestController {

    @GetMapping("/t1")
    public String test() {
        System.out.println("TestController==>test()执行了");
        return "OK";
    }

}
