<%-- 
    Document   : jspDIVdemo
    Created on : Mar 4, 2021, 6:51:48 PM
    Author     : Razer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--
id 选择器可以为标有特定 id 的 HTML 元素指定特定的样式。HTML元素以id属性来设置id选择器,CSS 中 id 选择器以 "#" 来定义。

class 选择器用于描述一组元素的样式，class 选择器有别于id选择器，class可以在多个元素中使用。
class 选择器在HTML中以class属性表示, 在 CSS 中，类选择器以一个点"."号显示：

<tr> 是盒子中的一行， <td>表示一个单元格
--%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
    </head>
    <body>
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
