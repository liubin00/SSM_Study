package com.lb;

import com.lb.dao.UserMapper;
import com.lb.pojo.User;
import com.lb.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/10/21:57
 */
public class UserMapperTest {

    @Test
    public void Test() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.deleteUser(6);
        if (i > 0) {
            System.out.printf("删除成功");
        }
        sqlSession.close();
    }
}
