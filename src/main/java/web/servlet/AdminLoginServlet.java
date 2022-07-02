package web.servlet;

import mapper.AdministratorMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Administrator;
import util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;

//TODO
@WebServlet("")
public class AdminLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2.查询
        //获取
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        //查询
        AdministratorMapper administratorMapper = sqlSession.getMapper(AdministratorMapper.class);
        List<Administrator> admin = administratorMapper.select(username, password);

        sqlSession.close();

        //获取字符输入流
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();
        //判断是否为null
        if(admin!=null){
            //登录成功
            //TODO:跳到加载品牌商菜单
            writer.write("登录成功");
        }else{
            //登录失败
            writer.write("登录失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
