<%@ page contentType="text/html; charset=gb2312" %>
<%@ page import="java.sql.*, javax.sql.*,javax.naming.*"%>
<html>
<head> <title>DataSource Test</title>
</head>
<body>
<%
try {
Context context = new InitialContext();
DataSource ds = (DataSource) context.lookup("java:comp/env/jdbc/bookDS");//��context.xml�ļ����name���Ӧ
Connection conn = ds.getConnection();
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM books"); // ���ұ�"books �е�����
out.println("<table border=1>");
out.println("<tr><td>���</td><td>����</td><td>����</td><td>�۸�</td></tr>");
while (rs.next()){
out.println("<tr><td>"+ rs.getString(1)+"</td><td>"+ rs.getString(2)  //rs.getString(3)Ҳ���Դ����
+"</td><td>"+ rs.getString(3)
+"</td><td>"+ rs.getString(5)+"</td></tr>");
}
out.println("</table>");
out.println(" ");

//out.print("ͨ������Դ�������ݿ�ɹ�");

rs.close(); //����ر�
stmt.close();
conn.close();
}catch (Exception e) { 
out.println(e.getMessage());
}
%>
</body></html>