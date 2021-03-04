/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.beans.BookBean;
import com.beans.BookDAO;
import javax.servlet.annotation.WebServlet;

@WebServlet("/bookinsert.do")
public class BookInsertServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,HttpServletResponse response)
             throws ServletException,IOException{
             	
    request.setCharacterEncoding("gb2312"); //设置编码
    String message = null;  
    BookBean book = new BookBean(
        request.getParameter("bookid"),request.getParameter("title"),
        request.getParameter("author"),request.getParameter("publisher"),
        Float.parseFloat(request.getParameter("price"))
    	); 
    BookDAO bookdao = new BookDAO();
    boolean success = bookdao.insertBook(book); //调用insertBook（）实现向数据库插入信息
    if(success){
       message = "成功插入一条记录！";
     }else{ 
       message = "插入记录错误！";
    }   
   request.setAttribute("result",message);
   RequestDispatcher view = request.getRequestDispatcher("/bookInsert.jsp"); //继续返回插入图书信息页面可再次插入新图书信息
   view.forward(request, response);
 }
}