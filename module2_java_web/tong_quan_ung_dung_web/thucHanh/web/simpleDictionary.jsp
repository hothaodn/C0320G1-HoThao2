<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/6/2020
  Time: 11:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <h2>Vietnamese Dictionary</h2>
    <form method="get" action="/search">
        <input type="text" name="word" placeholder="Enter your word: "/>
        <input type = "submit" id = "submit" value = "Search"/>
    </form>
</body>
</html>
