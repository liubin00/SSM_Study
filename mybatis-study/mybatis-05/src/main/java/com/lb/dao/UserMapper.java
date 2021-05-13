package com.lb.dao;

import com.lb.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/06/21:52
 */
public interface UserMapper {
    @Select("select * from user")
    List<User> getUsers();

    /**
     * 方法存在多个参数，所有的参数前面必须加入@Param注解
     *
     * @param id
     * @param name
     * @return
     */
    @Select("select * from user where id= #{id} and name=#{name}")
    User getUserByID(@Param("id") int id, @Param("name") String name);

    @Insert("insert into user(id,name,pwd) values(#{id},#{name},#{pwd})")
    int addUser(User user);

    @Update("update user set name=#{name} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id}")
    int deleteUser(@Param("id") int id);
}

