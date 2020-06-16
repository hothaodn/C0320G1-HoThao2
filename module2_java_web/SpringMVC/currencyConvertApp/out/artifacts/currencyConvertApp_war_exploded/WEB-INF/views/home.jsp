<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/14/2020
  Time: 7:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="get" action="/convert">
    <fieldset>
      <legend><h1>Currency Convert</h1></legend>
      USD<input name="usd" placeholder="input usd" type="number"/><br/>
      <%--            Exchange Rate<input name="rate" placeholder="input exchange rate" type="number"/><br/>--%>
      <button type="submit">Submit</button>
      <div id="result"></div>
<%--      <p>${vnd}</p>--%>
      <c:if test = "${vnd != null}">
      <p>VND is:  <c:out value = "${vnd}"/><p>
      </c:if>
    </fieldset>
  </form>
  </body>
</html>
