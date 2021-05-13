package com.lb.dao;

import com.lb.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/06/21:52
 */
public interface UserMapper {

    User getUserById(int id);

    List<User> getUserByLimit(Map<String,Object> map);


    List<User> getUserByLimit2();


}

