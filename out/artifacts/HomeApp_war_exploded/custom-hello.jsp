<%--
  Created by IntelliJ IDEA.
  User: wilder
  Date: 29/05/18
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="css.css" rel="stylesheet" type="text/css">
</head>
<body>
<h1>
<%
    String sample = (String) request.getAttribute("sample");
    out.println(sample);
%>
</h1>
</body>
</html>
