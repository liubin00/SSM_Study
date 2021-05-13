package com.lb.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/05/07/14:56
 * @Commponet 等价于<bean id="user" class="com.lb.pojo.User"/>
 */

@Component
public class User {

    /**
     * value 相当于<property name="name" value="lb1"/>
     */
    @Value("lb1")
    public String name;

    @Value("lb1")
    public void setName(String name) {
        this.name = name;
    }
}
