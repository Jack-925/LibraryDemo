<%@ page contentType="text/html; charset=gb2312" %>
<html><head> 
        <title>Book Insert</title>
         <link rel="stylesheet" type="text/css" href="mystyle.css">
</head>
<body>
<h3>������ͼ����Ϣ��</h3>
<% 
    if(request.getAttribute("result")!=null)
     out.print(request.getAttribute("result"));
%>
<div id="container">
    <div class="header">
<form action = "bookinsert.do" method = "post">     <!-- �ᱻ������com.control�е�BookInsertServlet.java -->
 <table>
  <tr><td>���</td> <td><input type="text" name="bookid" ></td></tr>
  <tr><td>����</td><td><input type="text" name="title"></td></tr>      
  <tr><td>����</td><td><input type="text" name="author" ></td></tr>
  <tr><td>������</td><td><input type="text" name="publisher" ></td></tr>
  <tr><td>����</td><td><input type="text" name="price" ></td></tr>
  <tr><td><input type="submit" value="ȷ��" ></td>
      <td><input type="reset" value="����" ></td>
  </tr>
</table>
</form>
        </div>
    </div>
</body></html>