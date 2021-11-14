
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search form</title>
</head>
<body>
<table>
    <tr>
        <td>Id: </td>
        <td>${requestScope["product"].id}</td>
    </tr>
    <tr>
        <td>Name: </td>
        <td>${requestScope["product"].name}</td>
    </tr>
    <tr>
        <td>Price: </td>
        <td>${requestScope["product"].price}</td>
    </tr>
</table>

<p><a href="/product">Back to product list</a></p>
</body>
</html>
