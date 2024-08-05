<%--
  Created by IntelliJ IDEA.
  User: prasar
  Date: 8/2/24
  Time: 11:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #2c2c2c;
            color: #f0f0f0;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .welcome-container {
            background-color: #3a3a3a;
            padding: 50px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        .welcome-container h1 {
            margin: 0;
            font-size: 36px;
            color: #f39c12;
        }

        .welcome-container p {
            margin-top: 10px;
            font-size: 18px;
            color: #bdc3c7;
        }

        .welcome-container a {
            display: inline-block;
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #f39c12;
            color: #2c2c2c;
            text-decoration: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }

        .welcome-container a:hover {
            background-color: #e67e22;
        }
    </style>
</head>
<body>
<div class="welcome-container">
    <h1>Welcome, <%= request.getParameter("username") %>!</h1>
    <p>We are glad to have you here.</p>
    <a href="index.jsp">Log out</a>
</div>
</body>
</html>
