package com.lb.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/14/23:07
 */
public class IDUtils {

    public static String getId() {
        return UUID.randomUUID().toString().replace(".", "-");
    }

    @Test
    public void test(){
        System.out.println(getId());
    }
}
