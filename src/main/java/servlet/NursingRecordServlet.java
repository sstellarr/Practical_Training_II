package servlet;

import pojo.NursingRecord;
import service.NursingRecordService;
import service.impl.NursingRecordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/NursingRecordServlet/*")
public class NursingRecordServlet extends BaseServlet{
    private NursingRecordService nursingLevelService=new NursingRecordServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<NursingRecord> nursingRecords = nursingLevelService.selectAll();
        req.setAttribute("nursingRecords",nursingRecords);
        req.getRequestDispatcher("/queryNursingRecord.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String id=req.getParameter("id");
        String content=req.getParameter("content");
        String start=req.getParameter("start");
        String end=req.getParameter("end");
        String userId=req.getParameter("userid");
        String levelId=req.getParameter("levelid");

        NursingRecord nursingRecord = new NursingRecord(content, Date.valueOf(start), Date.valueOf(end), Integer.parseInt(userId), Integer.parseInt(levelId));
        nursingLevelService.add(nursingRecord);

        req.getRequestDispatcher("/NursingRecordServlet/selectAll").forward(req,resp);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        nursingLevelService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/NursingRecordServlet/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String content=req.getParameter("content");
        String start=req.getParameter("start");
        String end=req.getParameter("end");
        String userId=req.getParameter("userid");
        String levelId=req.getParameter("levelid");

        NursingRecord nursingRecord = new NursingRecord(Integer.parseInt(id),content, Date.valueOf(start), Date.valueOf(end), Integer.parseInt(userId), Integer.parseInt(levelId));
        nursingLevelService.update(nursingRecord);

        req.getRequestDispatcher("/NursingRecordServlet/selectAll").forward(req,resp);


    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        NursingRecord nursingRecord = nursingLevelService.selectById(Integer.parseInt(id));
        req.setAttribute("nursingRecord", nursingRecord);
        req.getRequestDispatcher("updateNursingRecord").forward(req,resp);

    }
}
