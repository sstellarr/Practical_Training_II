package servlet;

import pojo.CustomerCheckIn;
import service.CustomerCheckInService;
import service.impl.CustomerCheckInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/CustomerCheckInServlet/*")
public class CustomerCheckInServlet extends BaseServlet{
    private CustomerCheckInService customerCheckInService=new CustomerCheckInServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomerCheckIn> customerCheckIns = customerCheckInService.selectAll();
        req.setAttribute("customerCheckIns",customerCheckIns);
        req.getRequestDispatcher("/queryCustomerCheckIn.jsp").forward(req,resp);

    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String bedId=req.getParameter("bedid");
        String checkInDate=req.getParameter("checkindate");
        String expirationDate=req.getParameter("expirationdate");
        String attention=req.getParameter("attention");
        String customerId=req.getParameter("customerid");

        CustomerCheckIn customerCheckIn =
                new CustomerCheckIn(Integer.parseInt(bedId),Date.valueOf(checkInDate),Date.valueOf(expirationDate),attention,Integer.parseInt(customerId));
        customerCheckInService.add(customerCheckIn);

        req.getRequestDispatcher("/CustomerCheckInServlet/selectAll").forward(req,resp);

    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerCheckInService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/CustomerCheckInServlet/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String bedId=req.getParameter("bedid");
        String checkInDate=req.getParameter("checkindate");
        String expirationDate=req.getParameter("expirationdate");
        String attention=req.getParameter("attention");
        String customerId=req.getParameter("customerid");

        CustomerCheckIn customerCheckIn =
                new CustomerCheckIn(Integer.parseInt(id),Integer.parseInt(bedId),Date.valueOf(checkInDate),Date.valueOf(expirationDate),attention,Integer.parseInt(customerId));
        customerCheckInService.update(customerCheckIn);

        req.getRequestDispatcher("/CustomerCheckInServlet/selectAll").forward(req,resp);

    }

    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        CustomerCheckIn customerCheckIn = customerCheckInService.selectById(Integer.parseInt(id));
        req.setAttribute("customerCheckIn", customerCheckIn);
        req.getRequestDispatcher("/updateCustomerCheckIn.jsp").forward(req,resp);

    }

    }
