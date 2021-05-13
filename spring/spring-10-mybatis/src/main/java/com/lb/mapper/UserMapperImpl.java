package com.lb.mapper;

import com.lb.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/08/15:36
 */
public class UserMapperImpl implements UserMapper {

    //我们的所有操作，都是用sqlSession来执行，在原来，现在都是用sqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        return sqlSession.getMapper(UserMapper.class).selectUser();
    }
}
