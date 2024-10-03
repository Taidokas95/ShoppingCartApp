<%--
  Created by IntelliJ IDEA.
  User: hanna
  Date: 2024-10-02
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
</head>
<body>
<h2>Login</h2>
<form action="LoginServlet" method="post">
    <label for="username">Username:</label>
    <input type="text" name="username" id="username" required><br><br>

    <label for="password">Password:</label>
    <input type="password" name="password" id="password" required><br><br>

    <input type="submit" value="Login">
</form>
</body>
</html>
