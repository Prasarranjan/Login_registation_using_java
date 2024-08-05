<%--
  Created by IntelliJ IDEA.
  User: prasar
  Date: 8/2/24
  Time: 10:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<link rel="stylesheet" href="sty.css">
<body>
<div class="container">
    <h1>Login To Your Profile</h1>
    <form action="loginServlet" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>

        <button type="submit">Login</button>
    </form>
    <p><a href="index.jsp">Back To Home</a></p>
</div>
</body>
</html>
