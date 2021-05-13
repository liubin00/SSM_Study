package com.lb.dao;

import com.lb.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/19/19:42
 */
public interface UserMapper {


    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
