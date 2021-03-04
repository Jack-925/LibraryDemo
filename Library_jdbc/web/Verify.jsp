<%-- 
    Document   : Verify
    Created on : Nov 26, 2019, 9:58:02 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Client Verifying</title>
    </head>
     <style type="text/css">
             body{
                  background-image:url(bookstore.jpg) ;/* 图片地址 */
            }
            #container{
                margin:100px auto; /* 最外层边框*/
                width:500px; /* 调整宽度*/
                height:400px;  /* 调整高度*/
                text-align: center; 
                font-size:40px;
                font-style: italic;
                padding:15px 50px; /* 每个盒子从外到内是margin，border，padding，content */
                border-style: solid;
            }
            .header{
                font-size: 30px; 
                font-family: "Times New Roman", Times, serif;
               border-style:dashed;
               border-color: #cccccc;
               margin-top: 10px;
                  height:300px;
            }
            .loginWin{
                 margin: 10px auto; 
                 width: 300px;
                height:200px;
                 font-family: "Times New Roman", Times, serif;
            }
            .admin{
                text-align: right;
            }
           
        </style>
    <body>
        <%  //当从RegisterServlet注册失败跳转回来此页面时message中有“登陆失败”字符串
    if(request.getAttribute("message")!=null)
     out.print(request.getAttribute("message"));
%>
<br/>
  <div id="container">Welcome to Jack_Library
             <form action="verify.do" method="post">
            <div class="header">Please input your name and password
                <div class="loginWin">
                    <table>
                          <tr><td>Username</td><td><input type="text" name="id" ></td></tr>
                          <tr><td>Password</td><td><input type="text" name="password" ></td></tr>
                          <tr>
                             <td><input type="submit" value="确定" ></td>
                             <td><input type = "button" value = "注册" onclick = "window.location.href = 'register.jsp'"></td>   
               
                          </tr>
                    </table>
            </div>
                 </form>
                <div class="admin">
                      <td><input type = "button" value = "管理员登录" onclick = "window.location.href = 'AdministratorVerify.jsp'"></td>    
                </div>
            
        </div>
    </body>
</html>
