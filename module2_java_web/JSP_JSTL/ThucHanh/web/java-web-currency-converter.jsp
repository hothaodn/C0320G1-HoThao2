<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/7/2020
  Time: 3:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <form method="get" action="convert-usd.jsp">
        <legend>Currency Converter</legend>
        Rate<input type="number" name="rate">
        <br/>
        USD<input type="number" name="usd">
        <button type="submit">Convert</button>

    </form>
</body>
</html>
