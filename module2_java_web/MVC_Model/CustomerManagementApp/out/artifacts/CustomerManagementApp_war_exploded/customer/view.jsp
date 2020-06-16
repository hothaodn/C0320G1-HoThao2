<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/10/2020
  Time: 12:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <td>Name</td>
            <td>${requestScope["customer"].getId()}</td>
        </tr>
        <tr>
            <td>Email</td>
            <td>${requestScope["customer"].getEmail()}</td>
        </tr>
        <tr>
            <td>Address</td>
            <td>${requestScope["customer"].getAddress()}</td>
        </tr>
    </table>
</body>
</html>
