package com.lb.mapper;

import com.lb.pojo.User;

import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/08/15:08
 */
public interface UserMapper {
    public List<User> selectUser();
}
