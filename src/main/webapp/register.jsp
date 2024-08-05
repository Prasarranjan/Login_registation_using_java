<%--
  Created by IntelliJ IDEA.
  User: prasar
  Date: 8/2/24
  Time: 10:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<link rel="stylesheet" href="sty.css">
<body>
<div class="container">
    <h1>Login</h1>
    <form action="registerServlet" method="post">
        <label for="email">Email:</label>
        <input type="text" id="email" name="email" required><br>
        <label for="username">username:</label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">password:</label>
        <input type="password"id="password"name="password"required><br>
        <button>Register</button>
    </form>
    <p><a href="index.html">Back To Home</a></p>
</div>
</body>
</html>
