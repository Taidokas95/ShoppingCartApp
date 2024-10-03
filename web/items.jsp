<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Products</title>
</head>
<body>
<h2>Available Products</h2>
<table>
    <tr>
        <th>Product</th>
        <th>Price</th>
    </tr>
    <c:forEach var="item" items="${items}">
        <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>
                <form action="shoppingcart" method="post">
                    <input type="hidden" name="itemId" value="${item.id}" />
                    <input type="submit" value="Add to Cart" />
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
<a href="shoppingcart.jsp">View Cart</a>
</body>
</html>
