package servlet;

import mapper.StaffMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import pojo.Staff;
import service.BedService;
import service.StaffService;
import service.impl.BedServiceImpl;
import service.impl.StaffServiceImpl;
import util.SqlSessionFactoryUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Staff/*")
public class StaffServlet extends BaseServlet{
    private StaffService staffService= new StaffServiceImpl();

    /**
     * 登录
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void Login(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        //1.接受用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2.查询
        List<Staff> staff = staffService.select(username, password);

        //获取字符输入流
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer=resp.getWriter();
        //判断是否为null
        if(staff!=null){
            //登录成功
            //TODO:跳到index1.html
            //TODO:sendRedirect方法
            writer.write("登录成功");
        }else{
            //登录失败
            writer.write("登录失败");
        }
    }
}
