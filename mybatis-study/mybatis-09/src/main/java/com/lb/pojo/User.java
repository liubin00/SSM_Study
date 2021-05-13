package com.lb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/19/19:41
 */
@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;
}
