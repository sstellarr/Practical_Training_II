package servlet;


import pojo.Bed;
import service.BedService;
import service.impl.BedServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/BedServlet/*")
public class BedServlet extends BaseServlet{

    private BedService bedService= new BedServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Bed> beds = bedService.selectAll();

        req.setAttribute("beds",beds);

        req.getRequestDispatcher("/queryBed.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String buildingId=req.getParameter("buildingid");
        String roomId=req.getParameter("rommid");
        String isAvailable=req.getParameter("isavaibable");
        String userId=req.getParameter("userid");


        Bed bed = new Bed(Integer.parseInt(roomId),Integer.parseInt(buildingId),isAvailable,Integer.parseInt(userId));
        bedService.add(bed);

        req.getRequestDispatcher("/BedServlet/selectAll").forward(req,resp);

    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id=req.getParameter("id");
        bedService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/BedServlet/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String id=req.getParameter("id");
        String buildingId=req.getParameter("buildingid");
        String roomId=req.getParameter("rommid");
        String isAvailable=req.getParameter("isavaibable");
        String userId=req.getParameter("userid");

        Bed bed = new Bed(Integer.parseInt(id),Integer.parseInt(roomId),Integer.parseInt(buildingId),isAvailable,Integer.parseInt(userId));
        bedService.update(bed);
        req.getRequestDispatcher("/BedServlet/selectAll").forward(req,resp);
    }

    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id=req.getParameter("id");
        Bed bed = bedService.selectById(Integer.parseInt(id));
        req.setAttribute("bed", bed);
        req.getRequestDispatcher("/updateBed.jsp").forward(req,resp);

    }
}
