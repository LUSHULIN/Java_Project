package com.aia.servlet;

import cn.aia.dao.UserDao;
import cn.aia.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by admin on 2019/8/24.
 */
@WebServlet(name = "/LoginServlet",urlPatterns = "/LoginServlet")
public class LoginResult extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("跳转到登录结果界面");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        UserDao dao = new UserDao();
        User u = dao.login(loginUser);
        if (u == null){
            //跳转到登录界面
            request.getRequestDispatcher("/FailServlet").forward(request,response);
        } else {
            //跳转到登录失败界面
            request.setAttribute("user",u);
            request.getRequestDispatcher("/SuccessServlet").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        this.doPost(request,response);
    }
}
