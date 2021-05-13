import com.lb.dao.StudentMapper;
import com.lb.dao.TeacherMapper;
import com.lb.pojo.Student;
import com.lb.pojo.Teacher;
import com.lb.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/12/21:40
 */
public class MyTest {
    @Test
    public void TeacherTest() {
//        SqlSession sqlSession = MybatisUtil.getSqlSession();
//        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
//        Teacher teacheer = mapper.getTeacheer(1);
//        System.out.println(teacheer);
    }

    @Test
    public void StudentList(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> allStudent = mapper.getAllStudent();
        for (Student student : allStudent) {
            System.out.println(student);

        }
    }

    @Test
    public void getAllTeacher(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher2(1);
        System.out.println(teacher);
    }


}
