<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/8/24
  Time: 11:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>演示servlet 使用</title>
  </head>
  <body>
    <form action="/LoginServlet" method="post">
      <input type="text" name="username" placeholder="请输入用户名"><br>
      <input type="text" name="password" placeholder="请输入密码"><br>
      <input type="submit" value="提交">

    </form>
  </body>
</html>
