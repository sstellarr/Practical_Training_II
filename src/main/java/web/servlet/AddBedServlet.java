package web.servlet;

import com.alibaba.fastjson.JSON;
import pojo.Bed;
import service.BedService;
import service.impl.BedServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class AddBedServlet extends HttpServlet {

    private BedService bedService= new BedServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.接受床位数据
        BufferedReader br=req.getReader();
        String params=br.readLine();

        Bed bed = JSON.parseObject(params, Bed.class);

        //2.调用service添加
        bedService.add(bed);

        //3.响应成功
        //TODO
        resp.getWriter().write("添加成功");


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
