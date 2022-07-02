package web.servlet;

import mapper.AdministratorMapper;
import mapper.StaffMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Staff;
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
public class StaffLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2.查询
        SqlSessionFactory sqlSessionFactory= SqlSessionFactoryUtils.getSqlSessionFactory();
        SqlSession sqlSession = sqlSessionFactory.openSession();

        StaffMapper staffMapper = sqlSession.getMapper(StaffMapper.class);
        List<Staff> staff = staffMapper.select(username, password);

        sqlSession.close();

        //获取字符输入流
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();
        //判断是否为null
        if(staff!=null){
            //登录成功
            //TODO:跳到加载品牌商菜单:
            //TODO:sendRedirect方法
            writer.write("登录成功");
        }else{
            //登录失败
            writer.write("登录失败");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
