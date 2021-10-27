<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 27/10/2021
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CustomerList</title>
    <style>
      img{
        width: 30px;
        height: 30px;
      }
    </style>
  </head>
  <body>
  <h2>Customer List</h2>
  <table border="1">
    <tr>
      <th>Tên</th>
      <th>Ngày Sinh</th>
      <th>Địa chỉ</th>
      <th>Hình ảnh</th>
    </tr>
    <c:forEach var="studentObj" items="${studentListServlet}" varStatus="loop">
      <tr>
        <td>${studentObj.name}</td>
        <td>${studentObj.dateOfBirth}</td>
        <td>${studentObj.address}</td>
        <td><img src="${studentObj.image}" alt=""></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
