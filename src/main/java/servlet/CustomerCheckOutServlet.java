package servlet;

import pojo.CustomerCheckOut;
import service.CustomerCheckOutService;
import service.impl.CustomerCheckOutServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/CustomerCheckout/*")
public class CustomerCheckOutServlet extends BaseServlet{

    private CustomerCheckOutService customerCheckOutService=new CustomerCheckOutServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomerCheckOut> customerCheckouts = customerCheckOutService.selectAll();
        //TODO

    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String retreatTime=req.getParameter("retreattime");
        String retreatReason=req.getParameter("retreatreason");
        String askTime=req.getParameter("asktime");
        String auditPerson=req.getParameter("auditperson");
        String auditOpinion=req.getParameter("auditopinion");
        String retreatId=req.getParameter("retreatid");

        CustomerCheckOut customerCheckOut =
                new CustomerCheckOut(Date.valueOf(retreatTime),retreatReason,Date.valueOf(askTime),auditPerson,auditOpinion,Integer.parseInt(retreatId));
        customerCheckOutService.add(customerCheckOut);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerCheckOutService.deleteById(Integer.parseInt(id));

    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String retreatTime=req.getParameter("retreattime");
        String retreatReason=req.getParameter("retreatreason");
        String askTime=req.getParameter("asktime");
        String auditPerson=req.getParameter("auditperson");
        String auditOpinion=req.getParameter("auditopinion");
        String retreatId=req.getParameter("retreatid");

        CustomerCheckOut customerCheckOut =
                new CustomerCheckOut(Integer.parseInt(id),Date.valueOf(retreatTime),retreatReason,Date.valueOf(askTime),auditPerson,auditOpinion,Integer.parseInt(retreatId));
        customerCheckOutService.update(customerCheckOut);
    }

}
