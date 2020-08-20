package cn.zju.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("myServlet init");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("My First Servlet!");
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("myServlet destroyed.");
    }
}
