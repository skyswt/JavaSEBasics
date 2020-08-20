package cn.zju.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

//@WebServlet("/test")
public class MyServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        Cookie[] cks = req.getCookies();
//        super.doGet(req, resp);
        System.out.println("doget");
        resp.addCookie(new Cookie("c", "32"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    /*public static void main(String[] args) throws UnsupportedEncodingException {
        Cookie cookie = new Cookie(
                URLEncoder.encode("姓名", "UTF-8"),
                URLEncoder.encode("天菜", "UTF-8"));
        System.out.println(cookie.getName());
        System.out.println(URLDecoder.decode(cookie.getName(), "UTF-8"));
    }*/
}
