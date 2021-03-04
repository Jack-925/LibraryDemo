package com.control;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.beans.BookBean;
import com.beans.BookDAO;
import javax.servlet.annotation.WebServlet;
@WebServlet("/bookquery.do") //将此url导到此servlet
public class BookQueryServlet extends HttpServlet{
   public void doPost(HttpServletRequest request,HttpServletResponse response)
             throws ServletException,IOException{ //对post动作的处理
    String bookid = request.getParameter("bookid"); //获取在bookQuery.jsp中提交的bookid
    BookDAO bookdao = new BookDAO();
    BookBean book = bookdao.searchBook(bookid);
    
    if(book!=null){
      request.getSession().setAttribute("book", book);//用request.getSession()得到session，并将信息
      RequestDispatcher view = request.getRequestDispatcher("/display.jsp"); //跳往此界面显示被搜索书籍信息
      view.forward(request, response);
    }else{ //若不存在则跳往error界面
      RequestDispatcher view = request.getRequestDispatcher("/errorPage.jsp");
      view.forward(request, response);
    }
  }	
}