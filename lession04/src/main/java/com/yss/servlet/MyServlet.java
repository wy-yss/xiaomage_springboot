package com.yss.servlet;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: yss
 * @Description:
 * @Date: Created in 1:07 2018/3/25
 */
@WebServlet(name = "myServlet", urlPatterns = "/myServlet",
        initParams = {@WebInitParam(name = "myName",value = "myValue")}
)
public class MyServlet extends HttpServlet {

    private static final long serialVersionUID = 6053446335941125171L;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("myServlet");
    }
}
