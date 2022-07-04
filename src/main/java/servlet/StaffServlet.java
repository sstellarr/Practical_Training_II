package servlet;

import pojo.Staff;
import service.StaffService;
import service.impl.StaffServiceImpl;

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
//            req.getRequestDispatcher("/succeed.jsp").forward(req, resp);
            resp.sendRedirect("/login.jsp");    //TODO
        }else{
            //登录失败
//            writer.write("登录失败");
            resp.sendRedirect("/login.jsp");    //TODO
        }
    }

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Staff> staff = staffService.selectAll();
        req.setAttribute("staff",staff);
        req.getRequestDispatcher("/queryStaff.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String gender=req.getParameter("gender");
        String staffId=req.getParameter("staffid");
        String type=req.getParameter("type");
        String account=req.getParameter("account");
        String password=req.getParameter("password");
        String tel=req.getParameter("tel");
        String relation=req.getParameter("relation");

        Staff staff = new Staff(name, gender, staffId, type, account, password, tel, relation);
        staffService.add(staff);

        req.getRequestDispatcher("/Staff/selectAll").forward(req,resp);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        staffService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/Staff/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String gender=req.getParameter("gender");
        String staffId=req.getParameter("staffid");
        String type=req.getParameter("type");
        String account=req.getParameter("account");
        String password=req.getParameter("password");
        String tel=req.getParameter("tel");
        String relation=req.getParameter("relation");

        Staff staff = new Staff(Integer.parseInt(id),name, gender, staffId, type, account, password, tel, relation);
        staffService.update(staff);

        req.getRequestDispatcher("/Staff/selectAll").forward(req,resp);


    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        Staff staff = staffService.selectById(Integer.parseInt(id));
        req.setAttribute("staff", staff);
        req.getRequestDispatcher("updateStaff").forward(req,resp);

    }
}
