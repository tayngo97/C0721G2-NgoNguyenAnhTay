<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 15/11/2021
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Settings</h3>
    <table>
        <tr>
            <th>Language</th>
            <th>Page Size</th>
            <th>Spams Filter</th>
            <th>Signature</th>
        </tr>
        <tr>
            <td>${email.languages}</td>
            <td>${email.pageSize}</td>
            <td>${email.filler}</td>
            <td>${email.signatures}</td>
        </tr>
    </table>
</body>
</html>
