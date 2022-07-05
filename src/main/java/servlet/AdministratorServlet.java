package servlet;

import pojo.Administrator;
import service.AdministratorService;
import service.impl.AdministratorServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/Administrator/*")
public class AdministratorServlet extends BaseServlet {
    private AdministratorService administratorServlet = new AdministratorServiceImpl();

    public void Login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //1.接受用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        //2.查询
        List<Administrator> administrators = administratorServlet.select(username, password);

        //获取字符输入流
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter writer = resp.getWriter();
        //判断是否为null
        if (administrators != null) {
            //登录成功
            resp.sendRedirect("/index2.html");

        } else {
            //登录失败
            writer.write("登录失败");
//            resp.sendRedirect("/login.jsp");

        }
    }

}
