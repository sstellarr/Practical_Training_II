package servlet;

import service.CustomerCheckInService;
import service.impl.CustomerCheckInServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CustomerCheckInServlet extends BaseServlet{
    private CustomerCheckInService customerCheckInService=new CustomerCheckInServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

}