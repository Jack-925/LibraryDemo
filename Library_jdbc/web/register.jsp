<%-- 
    Document   : register
    Created on : Nov 27, 2019, 9:20:10 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Interface</title>
        <link rel="stylesheet" type="text/css" href="mystyle.css">
    </head>
    <body>
         <div id="container">
         
          <form action="register.do" method="post">  <!-- 会被引导到com.control中的RegisterServlet.java -->
 <table>
  <tr><td>您想注册的账户名</td><td>   <input type="text" name="id"></td></tr>
  <tr><td>请确定密码</td><td><input type="text" name="password" ></td></tr>
  <tr>
      <td><input type="submit" value="确定" ></td>
  </tr>
</table>
              
         </div>
       </form>
     
        

    </body>
</html>
