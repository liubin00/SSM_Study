package com.lb.pojo;

import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/06/21:51
 */
@Alias("User")
public class User {
    private int id;
    private String name;
    private String pwd;

    public User() {

    }

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getpwd() {
        return pwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
