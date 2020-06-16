<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/10/2020
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
    <h1>SIMPLE CALCULATOR</h1>
    <form action="/calcu" method="get">
        <fieldset>
            <legend>Calculator</legend>
            <label>First Operand</label>
            <input type="number" name="firstOper">
            <label>Second Operand</label>
            <select name="operator">
                <option value="+">Add</option>
                <option value="-">Sub</option>
                <option value="*">Multi</option>
                <option value="/">Devise</option>
            </select>
            <label>Second Operand</label>
            <input type="number" name="secondOper">
            <button type="submit">Calculate</button>
            <c:if test='${requestScope["result"] != null}'>
                <span class="message">${requestScope["result"]}</span>
            </c:if>
        </fieldset>
    </form>

  </body>
</html>
