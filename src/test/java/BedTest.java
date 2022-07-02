import mapper.BedMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Bed;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Mybatis 代理开发
 */
public class BedTest {

    @Test
    public void testSelectAll() throws IOException {

        //1. 加载mybatis的核心配置文件，获取 SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //2. 获取SqlSession对象，用它来执行sql
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //3. 执行sql
        //3.1 获取UserMapper接口的代理对象
        BedMapper it = sqlSession.getMapper(BedMapper.class);
        List<Bed> ls = it.selectAll();

        System.out.println(ls);
        //4. 释放资源
        sqlSession.close();
    }
}