package servlet;

import pojo.FoodRecord;
import service.FoodRecordService;
import service.impl.FoodRecordServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/FoodRecord/*")
public class FoodRecordServlet extends BaseServlet{
    private FoodRecordService foodRecordService=new FoodRecordServiceImpl();

    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<FoodRecord> foodRecords = foodRecordService.selectAll();
        req.setAttribute("foodRecords",foodRecords);
        req.getRequestDispatcher("/queryFoodRecord.jsp").forward(req,resp);
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String food=req.getParameter("food");
        String date=req.getParameter("date");
        String foodId=req.getParameter("foodid");

        FoodRecord foodRecord = new FoodRecord(food, Date.valueOf(date), Integer.parseInt(foodId));
        foodRecordService.add(foodRecord);

        req.getRequestDispatcher("/FoodRecord/selectAll").forward(req,resp);

    }


    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        foodRecordService.deleteById(Integer.parseInt(id));
        req.getRequestDispatcher("/FoodRecord/selectAll").forward(req,resp);
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        String food=req.getParameter("food");
        String date=req.getParameter("date");
        String foodId=req.getParameter("foodid");

        FoodRecord foodRecord = new FoodRecord(Integer.parseInt(id),food, Date.valueOf(date), Integer.parseInt(foodId));
        foodRecordService.update(foodRecord);

        req.getRequestDispatcher("/FoodRecord/selectAll").forward(req,resp);

    }
    public void selectById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id=req.getParameter("id");
        FoodRecord foodRecord = foodRecordService.selectById(Integer.parseInt(id));
        req.setAttribute("foodRecord", foodRecord);
        req.getRequestDispatcher("updateFoodRecord").forward(req,resp);

    }
}
