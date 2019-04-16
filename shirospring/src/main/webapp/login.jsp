<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/4/11 0011
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="doLogin" method="post">
        User: <input type="text" name="userName"><br>
        Pwd:<input type="password" name="password">
        <input type="submit" value="登陆">
    </form>
</body>
</html>
