package servlet;

import pojo.NursingLevel;
import service.NursingLevelService;
import service.impl.NursingLevelServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/NursingLevel/*")
public class NursingLevelServlet extends BaseServlet{
    private NursingLevelService nursingLevelService=new NursingLevelServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NursingLevel> nursingLevels = nursingLevelService.selectAll();
        req.setAttribute("nursingLevels",nursingLevels);
        req.getRequestDispatcher("/queryNursingLevel.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String status=req.getParameter("status");

        NursingLevel nursingLevel = new NursingLevel(name, status);
        nursingLevelService.add(nursingLevel);

        req.getRequestDispatcher("/NursingLevel/selectAll").forward(req,resp);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        nursingLevelService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/NursingLevel/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String name=req.getParameter("name");
        String status=req.getParameter("status");

        NursingLevel nursingLevel = new NursingLevel(Integer.parseInt(id),name, status);
        nursingLevelService.update(nursingLevel);

        req.getRequestDispatcher("/NursingLevel/selectAll").forward(req,resp);


    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        NursingLevel nursingLevel = nursingLevelService.selectById(Integer.parseInt(id));
        req.setAttribute("nursingLevel", nursingLevel);
        req.getRequestDispatcher("updateNursingLevel").forward(req,resp);

    }
}
