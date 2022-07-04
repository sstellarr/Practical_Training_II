package servlet;

import pojo.CustomerGoOut;
import service.CustomerGoOutService;
import service.impl.CustomerGoOutServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/CustomerGoOut/*")
public class CustomerGoOutServlet extends BaseServlet{
    private CustomerGoOutService customerGoOutService=new CustomerGoOutServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<CustomerGoOut> customerGoOuts = customerGoOutService.selectAll();
        //TODO
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String outGoingReason=req.getParameter("outgoingreason");
        String outGoingTime=req.getParameter("outgoingtime");
        String expectedReturnTime=req.getParameter("expectedreturntime");
        String actualReturnTime=req.getParameter("actualreturntime");
        String escort=req.getParameter("escort");
        String escortTel=req.getParameter("escorttel");
        String customerId=req.getParameter("customerid");

        CustomerGoOut customerGoOut=
                new CustomerGoOut(outGoingReason,outGoingTime,expectedReturnTime,actualReturnTime,escort,escortTel,Integer.parseInt(customerId));
        customerGoOutService.add(customerGoOut);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        customerGoOutService.deleteById(Integer.parseInt(id));

    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String outGoingReason=req.getParameter("outgoingreason");
        String outGoingTime=req.getParameter("outgoingtime");
        String expectedReturnTime=req.getParameter("expectedreturntime");
        String actualReturnTime=req.getParameter("actualreturntime");
        String escort=req.getParameter("escort");
        String escortTel=req.getParameter("escorttel");
        String customerId=req.getParameter("customerid");

        CustomerGoOut customerGoOut=
                new CustomerGoOut(Integer.parseInt(id),outGoingReason,outGoingTime,expectedReturnTime,actualReturnTime,escort,escortTel,Integer.parseInt(customerId));
        customerGoOutService.update(customerGoOut);
    }

}
