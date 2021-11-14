<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student list</title>
</head>
<body>
    <h2>Student List C07G2</h2>
    <a href="/student_servlet?actionUser=create">Create new student</a>
    <table border="1">
        <tr>
            <th>No</th>
            <th>Id</th>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Gender</th>
            <th>Grade</th>
        </tr>
<%--        for (Student studentObj : studentListServlet)--%>
        <c:forEach var="studentObj" items="${studentListServlet}" varStatus="loop">
            <tr>
                <td>${loop.count}</td>
                <td><c:out value="${studentObj.id}"/></td>
                <td>${studentObj.name}</td>
                <td><c:out value="${studentObj.dateOfBirth}"/></td>
                <td>
                    <c:if test="${studentObj.gender == 1}">
                        Male
                    </c:if>
                    <c:if test="${studentObj.gender == 0}">
                        Female
                    </c:if>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${studentObj.grade < 5}">
                            Bad
                        </c:when>
                        <c:when test="${studentObj.grade < 8}">
                            Good
                        </c:when>
                        <c:otherwise>
                            Very good
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
