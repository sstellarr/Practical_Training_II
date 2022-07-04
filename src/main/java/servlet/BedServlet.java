package servlet;


import com.alibaba.fastjson.JSON;
import pojo.Bed;
import service.BedService;
import service.impl.BedServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/bed/*")
public class BedServlet extends BaseServlet{

    private BedService bedService= new BedServiceImpl();

    /**
     * 查询所有
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void selectAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Bed> beds = bedService.selectAll();

        //TODO：怎么显示
    }

    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String buildingId=req.getParameter("buildingid");
        String roomId=req.getParameter("rommid");
        String isAvailable=req.getParameter("isavaibable");

        Bed bed = new Bed(Integer.parseInt(roomId),Integer.parseInt(buildingId),isAvailable);
        bedService.add(bed);
        //TODO:是否要响应成功

    }

    public void deleteById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String id=req.getParameter("id");
        bedService.deleteById(Integer.parseInt(id));
        //TODO:是否要响应成功
    }

    public void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        String id=req.getParameter("id");
        String buildingId=req.getParameter("buildingid");
        String roomId=req.getParameter("rommid");
        String isAvailable=req.getParameter("isavaibable");
        String userId=req.getParameter("userid");//TODO：这个需要吗？

        Bed bed = new Bed(Integer.parseInt(id),Integer.parseInt(roomId),Integer.parseInt(buildingId),isAvailable,Integer.parseInt(userId));
        bedService.update(bed);
        //TODO:是否要响应成功
    }
}
