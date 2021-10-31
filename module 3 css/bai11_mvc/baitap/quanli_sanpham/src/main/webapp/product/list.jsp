<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>Customers</h1>
  <a href="/product?actionUser=create">Create new product</a>

  <form action="/product?actionUser=search" method="post">
      <input type="text" name="nameSearch" placeholder="Enter name">
      <input type="submit" value="Search">
  </form>

    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Price</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <c:forEach items="${product}" var="product">
            <tr>
                <td>${product.id}</td>
                <td><a href="/product?actionUser=view&id=${product.id}">${product.name}</a></td>
                <td>${product.price}</td>
                <td><a href="/product?actionUser=edit&name=${product.name}">edit</a></td>
                <td><a href="/product?actionUser=delete&id=${product.id}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
