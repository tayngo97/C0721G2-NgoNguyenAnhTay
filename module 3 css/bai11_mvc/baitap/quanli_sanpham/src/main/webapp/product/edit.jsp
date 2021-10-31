<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit Customer</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p><a href="/product">Back to product list</a></p>
<h1>Edit Customer</h1>
<form method="post" >
    <fieldset>
        <legend>Customer information</legend>
        <table>
            <tr>
                <td>Id:</td>
                <td><input type="number" name="id" id="id" value="${requestScope["product"].id}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="nameProduct" id="name" value="${requestScope["product"].name}"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="number" name="price" id="price" value="${requestScope["product"].price}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update customer"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
