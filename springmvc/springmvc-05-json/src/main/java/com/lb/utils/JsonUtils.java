package com.lb.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

/**
 * @author: lb
 * @Date: 2021/05/11/12:27
 */
public class JsonUtils {

    public static String getJson(Object object) throws JsonProcessingException {
        return getJson(object, "yyyy-mm-dd HH:mm:ss");
    }

    public static String getJson(Object object, String dateFormat) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        //不使用时间戳的方式
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        //自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);

        mapper.setDateFormat(sdf);

            return mapper.writeValueAsString(object);

    }
}
