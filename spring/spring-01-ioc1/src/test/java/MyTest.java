import com.lb.UserDaoImpl;
import com.lb.UserDaoImpl2;
import com.lb.UserService;
import com.lb.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/20/20:40
 */
public class MyTest {
    @Test
    public void Test() {
        //获取ApplicationContext: 拿到spring的容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下你有
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
