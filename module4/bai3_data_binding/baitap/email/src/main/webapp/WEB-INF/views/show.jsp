<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>Settings</h3>
    <form:form action="" method="post" modelAttribute="email">
        <table>
            <tr>
                <td>Languages</td>
                <td>
                <form:select path="languages">
                    <form:options items="${languages}"></form:options>
                </form:select>
                </td>
            </tr>
            <tr>
                <td>Page Size</td>
                <td>
                    <form:select path="pageSize">
                        <form:options  items="${pageSize}"></form:options>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Spams filter</td>
                <td>
                    <form:checkbox path="filler" items="${filter}"></form:checkbox>
                </td>
            </tr>
            <tr>
                <td>Signature</td>
                <td><form:textarea path="signatures"></form:textarea>
                </td>
            </tr>
            <tr>
                <td>
                    <button type="submit" value="submit">Update</button>
                </td>
                <td>
                    <button>Cancel</button>
                </td>
            </tr>
        </table>
    </form:form>

</body>
</html>
