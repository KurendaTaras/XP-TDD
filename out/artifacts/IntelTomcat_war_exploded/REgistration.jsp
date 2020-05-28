<%--
  Created by IntelliJ IDEA.
  User: Згидиш
  Date: 12.05.2020
  Time: 17:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <link rel="stylesheet" href="web/Registration.css">
</head>
<body>
<div class="container">

<form action="${pageContext.request.contextPath}/registration" method="post">
    <div class="dws-input">
        <input type="text" name="username" placeholder="Введите логин">
    </div>
    <div class="dws-input">
        <input type="password" name="password" placeholder="Введите пароль">
    </div>
    <input class="dws-submit" type="submit" name="submit" value="Зареєструватися"><br />

</form>
</div>



</body>
</html>
