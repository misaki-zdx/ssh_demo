<%--
  Created by IntelliJ IDEA.
  User: Misaki
  Date: 2018/7/11
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@  taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>save页面</title>
</head>
<body>
<s:form action="test_save" method="post">
    姓名:<input type="text" name="name"></br>
    密码:<input type="password" name="password"></br>
    <input type="submit" value="submit">
</s:form>
</body>
</html>
