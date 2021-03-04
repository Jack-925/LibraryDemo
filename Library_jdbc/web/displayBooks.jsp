<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.sql.*, javax.sql.*,javax.naming.*"%>
<html>
<head> <title>DataSource Test</title>
</head>
<body>
<%
try {
Context context = new InitialContext();
DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/bookDS");//和context.xml文件里的name相对应
Connection conn = ds.getConnection();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM books"); // 查找表"books 中的所有
out.println("<table border=1>");
out.println("<tr><td>书号</td><td>书名</td><td>作者</td><td>价格</td></tr>");
while (rs.next()){
out.println("<tr><td>"+ rs.getString(1)+"</td><td>"+ rs.getString(2)  //rs.getString(3)也可以打出来
+"</td><td>"+ rs.getString(3)
+"</td><td>"+ rs.getString(5)+"</td></tr>");
}
out.println("</table>");
out.println(" ");

//out.print("通过数据源访问数据库成功");

rs.close(); //逐个关闭
stmt.close();
conn.close();
}catch (Exception e) { 
out.println(e.getMessage());
}
%>
</body></html>