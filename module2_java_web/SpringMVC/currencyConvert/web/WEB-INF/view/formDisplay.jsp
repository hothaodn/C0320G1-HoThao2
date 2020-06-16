<%--
  Created by IntelliJ IDEA.
  User: TechCare
  Date: 6/10/2020
  Time: 9:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Convert</title>
</head>
<body>
    <form>
        <fieldset>
            <legend><h1>Currency Convert</h1></legend>
            USD<input name="usd" placeholder="input usd" type="number"/><br/>
            Exchange Rate<input name="rate" placeholder="input exchange rate" type="number"/><br/>
            <button type="submit">Submit</button>
            <div id="result"></div>
        </fieldset>
    </form>
</body>
</html>
