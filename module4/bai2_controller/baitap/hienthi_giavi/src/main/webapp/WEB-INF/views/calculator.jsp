<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 12/11/2021
  Time: 23:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Calculator</h3>
    <form action="/calculator1" method="post">
        <input type="number" value="${number1}" name="number1">
        <input type="number" value="${number2}" name="number2">
        <br>
        <button type="submit" name="tinhtoan"  value="cong">Addition(+)</button>
        <button type="submit" name="tinhtoan" value="tru">Subtraction(-)</button>
        <button type="submit" name="tinhtoan" value="nhan">Multiplication(X)</button>
        <button type="submit" name="tinhtoan" value="chia">Division(\)</button>
    </form>

    <h2>Result : ${result}</h2>
</body>
</html>
