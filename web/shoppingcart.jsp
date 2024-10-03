<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Shopping Cart</title>
</head>
<body>
<h2>Your Shopping Cart</h2>
<table border="1">
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
    <c:forEach var="item" items="${cart}">
        <tr>
            <td>${item.product.name}</td>
            <td>${item.product.price}</td>
            <td>${item.quantity}</td>
        </tr>
    </c:forEach>
</table>
<a href="checkout.jsp">Proceed to Checkout</a>
</body>
</html>
