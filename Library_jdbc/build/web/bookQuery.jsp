<%@ page contentType="text/html; charset=gb2312" %>
<html><head> <title>Book Query</title>
</head>
<body>
请输入一个书号:<br>
<form action="bookquery.do" method = "post">  <!-- 会被引导到com.control中的BookQueryServlet.java -->
<input type="text" name="bookid"><br>
<input type="submit" value="提交">
</form>
</body>
</html>