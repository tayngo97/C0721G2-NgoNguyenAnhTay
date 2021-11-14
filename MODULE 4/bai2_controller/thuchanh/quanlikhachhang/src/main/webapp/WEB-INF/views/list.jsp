<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table style="border: black solid 1px">
        <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Email</td>
            <td>Address</td>
        </tr>
            <c:forEach items="${customers}" var="customer">
              <tr>
                  <td>${customer.id}</td>
                  <td><a href="/info_customer?id=${customer.id}">${customer.name}</a></td>
                  <td>${customer.email}</td>
                  <td>${customer.address}</td>
              </tr>
            </c:forEach>

    </table>
</body>
</html>
