<%--
  Created by IntelliJ IDEA.
  User: Згидиш
  Date: 11.05.2020
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Увійти</title>
    <link rel="stylesheet" href="web/Style.css">

</head>
<body >


<div class="container">
    </br>
    </br>
    </br>
    <div class=" image">

    </div>
    <form action="/Intel_tomcat/Log_in">
        <div>
        <input type="text" name="Username" placeholder="Введіть своє ім'я">
        </div>
<div>
        <input type="password" name="Password " placeholder=" Введіть свій пароль">
</div>
        <div>
        <input type="submit" name="enter" value="Увійти">
        </div>
    </form>

</div>
</body>
</html>