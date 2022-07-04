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
        //1.调用service查询
        List<Bed> beds = bedService.selectAll();

        //2.转为JSON
        //TODO
        String jsonString= JSON.toJSONString(beds);

        //3.写数据
        resp.setContentType("text/json;charset=utf-8");
        resp.getWriter().write(jsonString);
    }

    /**
     * 添加床位
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
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

    public void deleteById(Integer id){

    }

    public void update(Bed bed){

    }
}
