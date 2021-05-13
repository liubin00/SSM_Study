import com.lb.dao.BlogMapper;
import com.lb.pojo.Blog;
import com.lb.utils.IDUtils;
import com.lb.utils.MybatisUtil;
import org.apache.ibatis.cache.Cache;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: lb
 * @Date: 2021/04/14/23:52
 */
public class MyTest {
    @Test
    public void addBook() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();

        blog.setId(IDUtils.getId());
        blog.setTitle("MyBatis很难");
        blog.setAuthor("lb");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Java也很难");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("Spring也很难");
        mapper.addBook(blog);

        blog.setId(IDUtils.getId());
        blog.setTitle("微服务更加难");
        mapper.addBook(blog);

        sqlSession.close();

    }


    @Test
    public void queryBlogIF() {
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
//        hashMap.put("title", "MyBatis很难");
        hashMap.put("author", "aaaaa1");
        hashMap.put("id", "de3f6268-45b5-4138-8c15-220177a82a89");
//        hashMap.put("views", 9999);

        mapper.updateBlog(hashMap);

    }


    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtil.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        hashMap.put("ids",arrayList);
        List<Blog> blogs = mapper.queryBlogForeach(hashMap);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
    }
}
