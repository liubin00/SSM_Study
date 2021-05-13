package com.lb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/15:21
 *
 * 这里这个注解的意思，就是说明这个类被spring接管了，注册到容器中
 */
@Component
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("123") //属性注入值
    public void setName(String name) {
        this.name = name;
    }
}
