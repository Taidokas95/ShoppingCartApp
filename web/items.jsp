<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<h2>Available Products</h2>
<table border="1">
    <tr>
        <th>Product</th>
        <th>Price</th>
        <th>Action</th>
    </tr>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.name}</td>
            <td>${product.price}</td>
            <td>
                <form action="cart" method="post">
                    <input type="hidden" name="productId" value="${product.id}" />
                    <input type="submit" value="Add to Cart" />
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="cart">View Cart</a>
</body>
</html>
