<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/11/2020
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="/login" method="post"  modelAttribute="login">
<!--Thuộc tính modelAttribute của thẻ <form> được liên kết tới thuộc tính login của ModelAndView
        trả về từ phương thức home().-->
        <fieldset style="color: burlywood">
            <legend ><h1>LOGIN</h1></legend>
            <table>
                <tr>
                    <td>User Name </td>
                    <td><form:input type="text" path="account"/></td>
                </tr>
                <tr>
                    <td>Password </td>
                    <td><form:input type="password" path="password"/></td>
                </tr>
            </table>
            <button type="submit">Submit</button>
        </fieldset>
    </form:form>
</body>
</html>
