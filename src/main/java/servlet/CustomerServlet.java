package servlet;

import pojo.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/CustomerServlet/*")
public class CustomerServlet extends BaseServlet{
    private CustomerService customerService =new CustomerServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = customerService.selectAll();
        req.setAttribute("customers",customers);
        req.getRequestDispatcher("/queryCustomer.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String gender=req.getParameter("gender");
        String age=req.getParameter("age");
        String tel=req.getParameter("tel");
        String idCardNumber=req.getParameter("idcardnumber");
        String fileNumber=req.getParameter("filenumber");
        String account=req.getParameter("account");
        String password=req.getParameter("password");
        String height=req.getParameter("height");
        String birthday=req.getParameter("birthday");


        Customer customer =
                new Customer(name,gender,Integer.parseInt(age),tel,idCardNumber,fileNumber,account,password,Integer.parseInt(height), Date.valueOf(birthday));
        customerService.add(customer);

        req.getRequestDispatcher("/Customer/selectAll").forward(req,resp);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/Customer/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String gender=req.getParameter("gender");
        String age=req.getParameter("age");
        String tel=req.getParameter("tel");
        String idCardNumber=req.getParameter("idcardnumber");
        String fileNumber=req.getParameter("filenumber");
        String account=req.getParameter("account");
        String password=req.getParameter("password");
        String height=req.getParameter("height");
        String birthday=req.getParameter("birthday");


        Customer customer = new Customer(Integer.parseInt(id),name,gender,Integer.parseInt(age),tel,idCardNumber,fileNumber,account,password,Integer.parseInt(height), Date.valueOf(birthday));
        customerService.update(customer);


        req.getRequestDispatcher("/Customer/selectAll").forward(req,resp);

    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        Customer customer = customerService.selectById(Integer.parseInt(id));
        req.setAttribute("customer", customer);
        req.getRequestDispatcher("/updateCustomer.jsp").forward(req,resp);

    }
}
