<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Form</title>
</head>
<body>
    <h1>Create new product</h1>
    <p>
        <c:if test='${requestScope["message"] != null}'>
            <span>${requestScope["message"]}</span>
         </c:if>
    </p>
    <p><a href="/product">Back to product list</a></p>
    <h1>Create new product</h1>
    <form method="post">
        <fieldset>
            <legend>Customer information</legend>
            <table>
                <tr>
                    <td>id: </td>
                    <td><input type="number" name="id" id="id"></td>
                </tr>
                <tr>
                    <td>Name: </td>
                    <td><input type="text" name="name" id="name"></td>
                </tr>
                <tr>
                    <td>Price: </td>
                    <td><input type="number" name="price" id="price"></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Create customer"></td>
                </tr>
            </table>
        </fieldset>
    </form>
</body>
</html>
