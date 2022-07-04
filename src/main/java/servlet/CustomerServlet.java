package servlet;

import pojo.Customer;
import pojo.CustomerGoOut;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/Customer/*")
public class CustomerServlet extends BaseServlet{
    private CustomerService customerServive=new CustomerServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customers = customerServive.selectAll();
        //TODO
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
        customerServive.add(customer);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerServive.deleteById(Integer.parseInt(id));

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


        Customer customer =
                new Customer(Integer.parseInt(id),name,gender,Integer.parseInt(age),tel,idCardNumber,fileNumber,account,password,Integer.parseInt(height), Date.valueOf(birthday));
        customerServive.update(customer);

    }

}
