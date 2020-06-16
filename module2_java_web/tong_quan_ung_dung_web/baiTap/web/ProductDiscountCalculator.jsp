<%--
  Created by IntelliJ IDEA.
  User: ADMIN
  Date: 6/7/2020
  Time: 12:38 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
    <form method="get" action="/calculate">
        Product Description <input type="text" name="description-product"><br/>
        List Price <input type="number" name="price-product"><br/>
        Discount Percent (%) <input type="number" name="discount"><br/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
