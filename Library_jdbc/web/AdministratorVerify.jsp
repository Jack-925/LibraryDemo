<%-- 
    Document   : AdministratorVerify
    Created on : Mar 3, 2021, 10:17:31 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Administrator Verifying</title>
<link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
     <body>
        <%  //当从AdministratorVerifyServlet验证失败跳转回来此页面时message2中有“验证失败”字符串
    if(request.getAttribute("message2")!=null)
     out.print(request.getAttribute("message2"));
%>

  <div id="container">
          尊敬的管理员请输入您的口令<br/>
  <form action="AdminVerify.do" method="post">
      <div class="adminVerifyTable" margin-left="200px" border="solid">
      <table>
  <td><input type="text" name="password" ></td>

      <td><input type="submit" value="确定" ></td>
</table>
      </div>
       </form>
  </div>
  </body>
</html>
