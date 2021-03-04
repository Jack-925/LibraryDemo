<%-- 
    Document   : AdminChoice
    Created on : Mar 3, 2021, 10:34:18 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin choice</title>
          <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
         <%  //当从AdministratorVerifyServlet注册成功跳转回来此页面时message2中有“注册成功”字符串
    if(request.getAttribute("message2")==null)
    {
         RequestDispatcher view = request.getRequestDispatcher("/AdministratorVerify.jsp");
   view.forward(request, response);
    }
    else
     out.print(request.getAttribute("message2"));
%>
<div id="container">
    <tr>  尊敬的管理员，您想要执行以下何操作 ?</br> </tr>
    <tr>  <input type = "button" value = "插入新购买书籍信息" onclick = "window.location.href = 'bookInsert.jsp'"> </tr>
    <tr>  <input type = "button" value = "删除某本书籍" onclick = "window.location.href = 'bookInsert.jsp'"> </tr>
    <tr>  <input type = "button" value = "修改书籍信息" onclick = "window.location.href = 'bookInsert.jsp'"> </tr>
</div>
       
    </body>
</html>
