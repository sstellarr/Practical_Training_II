package servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 可用于替换HTTPServlet的基础类
 * 通过路径进行方法分发
 * 避免Servlet过多、过乱
 */
public class BaseServlet extends HttpServlet {
    //根据请求的最后一段路径来进行方法分发
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1. 获取请求路径
        String uri = req.getRequestURI();
        //2. 获取最后一段路径
        int index=uri.lastIndexOf('/');
        String methodName = uri.substring(index+1);

        //3.执行方法
        //通过反射
        //获取字节码对象Class
        Class<? extends BaseServlet> cls=this.getClass();

        //获取方法Method对象
        try {
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //执行方法
            System.out.println("成功进入try");
            method.invoke(this,req,resp);
        } catch (NoSuchMethodException e) {
            System.out.println("异常：NoSuchMethodException#######################");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            System.out.println("异常：InvocationTargetException#######################");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("异常：IllegalAccessException#######################");
            e.printStackTrace();
        }


    }
}
