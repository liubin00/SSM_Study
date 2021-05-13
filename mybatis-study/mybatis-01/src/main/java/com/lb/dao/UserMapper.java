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
    /**
     * 模糊查询
     * @param value
     * @return
     */
    List<User> getUserLike(String value);

    /**
     * 查询全部用户
     *
     * @return
     */
    List<User> getUserList();

    /**
     * 根据用户ID查询用户
     *
     * @param id
     * @return
     */
    User getUserById(int id);

    /**
     * 通过map
     *
     * @param map
     * @return
     */
    User getUserById2(Map<String, Object> map);


    /**
     * insert一个用户
     *
     * @param user
     * @return
     */
    int addUser(User user);

    /**
     * 万能map
     *
     * @param map
     * @return
     */
    User addUser2(Map<String, Object> map);


    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);


    /**
     * 删除一个用户
     *
     * @param id
     * @return
     */
    int deleteUser(int id);
}

