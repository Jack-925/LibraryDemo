<%-- 
    Document   : ClientChoice
    Created on : Mar 3, 2021, 9:21:45 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>What you want to do ?</title>
         <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
         <%  //当从VerifyServlet验证成功跳转回来此页面时message中有“"验证成功，欢迎您登录”字符串  
             //此段也有作用：防止客户直接访问此页面。若未登陆成功则会被传回首页面
    if(request.getAttribute("message")==null)
    {
         RequestDispatcher view = request.getRequestDispatcher("/index.html");
   view.forward(request, response);
    }
    else
     out.print(request.getAttribute("message"));
%>

<div id="container">
    What may I help you ?
    <div class="header">
 
        <p>Options</p>
        <form action="clientChoice.do" method="post">
  <select id="clientChoice" name="option">
  <option value="display">查看所有图书信息</option>
  <option value="query">查询书本信息</option>
  <tr> <td><input type="submit" value="确定" ></td></tr>
  </select>
            
</form>
    </div>
</div>

    </body>
</html>
