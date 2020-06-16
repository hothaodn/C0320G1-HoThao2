<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/14/2020
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="get" action="/search">
        <fieldset>
            <legend><h1>DICTIONARY</h1></legend>
            Word to search: <input name="en_word" type="text" placeholder="English"/>
            <button type="submit">Search</button>
            <p>Result: ${result}</p>
        </fieldset>
    </form>
</body>
</html>
