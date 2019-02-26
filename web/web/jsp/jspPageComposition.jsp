<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2019/2/1
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>一个简单的JSP页面-显示系统时间</title>
</head>
<body>
    <%
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String today=simpleDateFormat.format(date);
    %>
    当前时间：<%=today%>
</body>
</html>
