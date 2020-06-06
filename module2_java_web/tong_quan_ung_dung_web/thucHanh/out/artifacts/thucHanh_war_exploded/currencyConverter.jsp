<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/6/2020
  Time: 11:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Converter</title>
</head>
<body>
    <form method="post" action="/currencyConverter">
        <legend><h1>Currency Convert</h1></legend>
            USD<input name="usd" placeholder="input usd" type="number"/><br/>
            Exchange Rate<input name="rate" placeholder="input exchange rate" type="number"/><br/>
        <button type="submit">Submit</button>
        <div id="result"></div>
    </form>
</body>
</html>
