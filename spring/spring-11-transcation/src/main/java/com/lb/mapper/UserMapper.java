package com.lb.mapper;

import com.lb.pojo.User;

import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/08/16:08
 */
public interface UserMapper {
    public List<User> selectUser();

    /**
     * 添加一个用户
     *
     * @param user
     * @return
     */
    public int addUser(User user);

    /**
     * 删除一个用户
     *
     * @param id
     * @return
     */
    public int deleteUser(int id);
}
