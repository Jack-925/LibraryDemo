/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Razer
 */
@WebServlet(name = "VerifyServlet", urlPatterns = {"/verify.do"})
public class VerifyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VerifyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VerifyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     Connection conn = null;//提高作用域
      PreparedStatement pstmt = null;
      ResultSet rst = null;
        try {
Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
String dburl = "jdbc:mysql://localhost:3306/bookstore";
//b.建立连接对象， 与数据库建立连接
conn = DriverManager.getConnection(dburl,"root","123456"); 
pstmt=conn.prepareStatement("SELECT * FROM login WHERE id=? and password=?");
pstmt.setString(1, request.getParameter("id"));
pstmt.setString(2, request.getParameter("password"));
rst=pstmt.executeQuery();
  if(rst.next()){
      request.setAttribute("message", "验证成功，欢迎您登录");
       RequestDispatcher view = request.getRequestDispatcher("/ClientChoice.jsp");
   view.forward(request, response);
  }
  else { 
      request.setAttribute("message", "登录失败，请检查您的账号与密码");
       RequestDispatcher view = request.getRequestDispatcher("/Verify.jsp");
   view.forward(request, response);
  }
  if(rst!=null) rst.close();
if(pstmt!=null) pstmt.close();
if(conn!=null) conn.close();
//   RequestDispatcher view = request.getRequestDispatcher("/Verify.jsp");
//   view.forward(request, response);
    }catch (Exception e) { 
e.printStackTrace();
}finally
        {

        }
    }
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
