import com.lb.dao.UserMapper;
import com.lb.pojo.User;
import com.lb.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/19/19:44
 */
public class MyTest {
    @Test
    public void queryUserById() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User queryUserById = mapper.queryUserById(1);
        System.out.println(queryUserById);
        System.out.println("=====================");

//        mapper.updateUser(new User(1, "2222", "333333"));
        sqlSession.clearCache();
        User queryUserById2 = mapper.queryUserById(1);
        System.out.println(queryUserById2);
        System.out.println(queryUserById == queryUserById2);

    }
}
