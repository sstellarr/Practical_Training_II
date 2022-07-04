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
        //TODO

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
    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerCheckInService.deleteById(Integer.parseInt(id));

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

    }

}
