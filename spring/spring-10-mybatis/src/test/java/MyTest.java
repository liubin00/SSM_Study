import com.lb.mapper.UserMapper;
import com.lb.mapper.UserMapperImpl;
import com.lb.mapper.UserMapperImpl2;
import com.lb.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author: lb
 * @Date: 2021/05/08/15:10
 */
public class MyTest {
    @Test
    public void select() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapperImpl2 userMapper = context.getBean("userMapper2", UserMapperImpl2.class);
        List<User> users = userMapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
