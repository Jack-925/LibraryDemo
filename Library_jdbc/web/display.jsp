<%@ page contentType="text/html;charset=gb2312"%>
<jsp:useBean id="book" class="com.beans.BookBean" scope="session"/>
<html><body>
        <%
          out.print("������Ҫ��ѯ���鼮��Ϣ���£�<br />");
        %>
   ��ţ�<jsp:getProperty name="book" property="bookid"/>
   ������<jsp:getProperty name="book" property="title"/>
   ���ߣ�<jsp:getProperty name="book" property="author"/>
   �����磺<jsp:getProperty name="book" property="publisher"/>
   �۸�<jsp:getProperty name="book" property="price"/>
</body></html>