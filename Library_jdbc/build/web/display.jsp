<%@ page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="book" class="com.beans.BookBean" scope="session"/>
<html><body>
        <%
          out.print("您好你要查询的书籍信息如下：<br />");
        %>
   书号：<jsp:getProperty name="book" property="bookid"/>
   书名：<jsp:getProperty name="book" property="title"/>
   作者：<jsp:getProperty name="book" property="author"/>
   出版社：<jsp:getProperty name="book" property="publisher"/>
   价格：<jsp:getProperty name="book" property="price"/>
</body></html>