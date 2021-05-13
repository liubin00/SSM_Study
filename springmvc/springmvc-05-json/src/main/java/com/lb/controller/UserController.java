package com.lb.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.lb.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/11/12:03
 */
@Controller
public class UserController {

    @RequestMapping("/j1")
    @ResponseBody //它就不会走视图解析器,会直接返回一个字符串
    public String json1() throws JsonProcessingException {
        //jackson, ObjectMapper

        ObjectMapper mapper = new ObjectMapper();

        User user = new User("lb", 3, "男");

        String s = mapper.writeValueAsString(user);
        return s;
    }

    @RequestMapping("/j2")
    @ResponseBody //它就不会走视图解析器,会直接返回一个字符串
    public String json2() throws JsonProcessingException {
        //jackson, ObjectMapper

        ObjectMapper mapper = new ObjectMapper();

        List<User> list = new ArrayList<User>();
        User user4 = new User("lb", 3, "男");
        User user1 = new User("lb", 3, "男");
        User user2 = new User("lb", 3, "男");
        User user3 = new User("lb", 3, "男");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        String s = mapper.writeValueAsString(list);
        return s;
    }


    @RequestMapping("/j3")
    @ResponseBody //它就不会走视图解析器,会直接返回一个字符串
    public String json3() throws JsonProcessingException {
        //使用ObjectMapper 来格式化输出
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        mapper.setDateFormat(sdf);
        return new ObjectMapper().writeValueAsString(sdf.format(new Date()));
    }
}
