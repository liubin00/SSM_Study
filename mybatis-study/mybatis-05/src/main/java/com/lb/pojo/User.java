package com.lb.pojo;

import lombok.*;
import org.apache.ibatis.type.Alias;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/06/21:51
 */
@Alias("User")
@Data
public class User {
    private int id;
    private String name;
    private String pwd;

}
