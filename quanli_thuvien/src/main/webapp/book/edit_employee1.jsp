<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/furama_css.css">
</head>
<body>

<div class="container position-relative">
    <%--    NAV-BAR--%>
    <div class="row bg-dark ">
        <div class="col-3">
            <%--          Logo--%>
            <div class="row">
                <a href="/home.jsp"><img src="../images/logo.png"></a>
            </div>

        </div>
        <div class="col-6"></div>
        <div class="col-3 d-flex align-items-center">
            <div class="row ">
                <a class="text-decoration-none text-light" href="#">
                    <h4>Ngô Nguyễn Anh Tây</h4>
                    <h6>C0721G2</h6>
                </a>
            </div>
        </div>
    </div>

    <%--    TASK-BAR--%>
    <div class="row bg-black mt-1 mb-1 task-bar">
        <div class="row d-flex d-inline align-items-center">

            <div class="col-8 d-flex d-inline justify-content-lg-around align-items-center">
                <a class="text-decoration-none text-light" href="/home.jsp">Home</a>
                <a class="text-decoration-none text-light" href="/employee">Employee</a>
                <a class="text-decoration-none text-light" href="#">Customer</a>
                <a class="text-decoration-none text-light" href="#">Service</a>
                <a class="text-decoration-none text-light" href="#">Contract</a>
            </div>

            <div class="col-4 ">
                <div class="row d-flex align-items-center">
                    <form class="form-inline d-flex align-items-center justify-content-lg-end">
                        <input class="form-control mr-sm-2 w-50" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                    </form>
                </div>
            </div>

        </div>
    </div>

    <div class="row h-100">
        <%--      SIDE-BAR--%>
        <div class="col-3 bg-secondary">
            <div class="row">
                <div class="col-12 d-flex justify-content-center">
                    <a href="#">Item1</a>
                </div>
            </div>
            <div class="row ">
                <div class="col-12 d-flex justify-content-center">
                    <a href="#">Item1</a>
                </div>
            </div>
            <div class="row ">
                <div class="col-12 d-flex justify-content-center">
                    <a href="#">Item1</a>
                </div>
            </div>
        </div>

        <%--            MAIN-CONTENT--%>
        <div class="col-9 bg-light">
            <div class="row">
                <div class="col-12">
                    <div class="row">
                        <%--  Edit Employee Form--%>
                        <section class="vh-100 gradient-custom">
                            <div class="container py-5 h-100">
                                <div class="row justify-content-center align-items-center h-100">
                                    <div class="col-12 col-lg-9 col-xl-7">
                                        <div class="card shadow-2-strong card-registration"
                                             style="border-radius: 15px;">
                                            <div class="card-body p-4 p-md-5">
                                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Edit Employee</h3>
                                                <%--   FORM--%>
                                                <form method="post" action="/employee">
                                                    <div class="row">

                                                        <div class="col-md-6 mb-4">
                                                            <div class="form-outline">
                                                                <input  readonly
                                                                        type="text"
                                                                        name="id"
                                                                        id="id"
                                                                        value="${employee.getId()}"
                                                                        class="form-control form-control-lg"
                                                                />
                                                                <label class="form-label" for="id">Employee
                                                                    Id</label>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-6 mb-4">
                                                            <div class="form-outline">
                                                                <input
                                                                        type="text"
                                                                        name="name"
                                                                        id="name"
                                                                        value="${employee.getName()}"
                                                                        class="form-control form-control-lg"
                                                                />
                                                                <label class="form-label" for="name">Employee
                                                                    Name</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6 mb-4 d-flex align-items-center">
                                                            <div class="form-outline datepicker w-100">
                                                                <input
                                                                        type="text"
                                                                        class="form-control form-control-lg"
                                                                        id="birthday"
                                                                        name="birthday"
                                                                        value="${employee.getBirthday()}"
                                                                />
                                                                <label for="birthday"
                                                                       class="form-label">Birthday</label>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-6 mb-4 d-flex align-items-center">
                                                            <div class="form-outline datepicker w-100">
                                                                <input
                                                                        type="number"
                                                                        class="form-control form-control-lg"
                                                                        id="salary"
                                                                        name="salary"
                                                                        value="${employee.getSalary()}"
                                                                />
                                                                <label for="salary" class="form-label">Salary</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6 mb-4 pb-2">
                                                            <div class="form-outline">
                                                                <input
                                                                        type="text"
                                                                        name="phone"
                                                                        id="phone"
                                                                        class="form-control form-control-lg"
                                                                        value="${employee.getPhoneNumberl()}"
                                                                />
                                                                <label class="form-label" for="phone">Phone
                                                                    Number</label>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-6 mb-4 pb-2">
                                                            <div class="form-outline">
                                                                <input
                                                                        type="text"
                                                                        name="email"
                                                                        id="email"
                                                                        class="form-control form-control-lg"
                                                                        value="${employee.getEmail()}"
                                                                />
                                                                <label class="form-label" for="email">Email</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6 mb-4 pb-2">

                                                            <div class="form-outline">
                                                                <input
                                                                        type="text"
                                                                        name="address"
                                                                        id="Address"
                                                                        class="form-control form-control-lg"
                                                                        value="${employee.getAdress()}"
                                                                />
                                                                <label class="form-label" for="Address">Address</label>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6 mb-4 pb-2">

                                                            <div class="form-outline">
                                                                <input
                                                                        type="text"
                                                                        name="username"
                                                                        id="username"
                                                                        class="form-control form-control-lg"
                                                                        value="${employee.getUserName()}"
                                                                />
                                                                <label class="form-label" for="username">Username</label>
                                                            </div>
                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-12">
                                                            <div class="form-outline">
                                                                <select id="position" name="position"
                                                                        class="select form-control-lg">
                                                                    <c:set var="position" scope="session"
                                                                           value="${employee.getPosition()}"/>
                                                                    <c:choose>
                                                                        <c:when test="${position == 1}">
                                                                            <option value="1">Lễ tân</option>
                                                                        </c:when>
                                                                        <c:when test="${position == 2}">
                                                                            <option value="2">Phục vụ</option>
                                                                        </c:when>
                                                                        <c:when test="${position == 3}">
                                                                            <option value="3">Chuyên viên</option>
                                                                        </c:when>
                                                                        <c:when test="${position == 4}">
                                                                            <option value="4">Giám sát</option>
                                                                        </c:when>
                                                                        <c:when test="${position == 5}">
                                                                            <option value="5">Quản lý</option>
                                                                        </c:when>
                                                                        <c:when test="${position == 6}">
                                                                            <option value="6">Giám đốc</option>
                                                                        </c:when>
                                                                    </c:choose>
                                                                    <option value="1">Lễ tân</option>
                                                                    <option value="2">Phục vụ</option>
                                                                    <option value="3">Chuyên viên</option>
                                                                    <option value="4">Giám sát</option>
                                                                    <option value="5">Quản lý</option>
                                                                    <option value="6">Giams đốc</option>
                                                                </select>
                                                                <label class="form-label"
                                                                       for="position">Position</label>
                                                            </div>


                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-12">

                                                            <div class="form-outline">
                                                                <select id="education" name="education"
                                                                        class="select form-control-lg">
                                                                    <c:set var="education" scope="session"
                                                                           value="${employee.getEducation_degree()}"/>
                                                                    <c:choose>
                                                                        <c:when test="${education == 1}">
                                                                            <option value="1">Trung cấp</option>
                                                                        </c:when>
                                                                        <c:when test="${education == 2}">
                                                                            <option value="2">Đại học</option>
                                                                        </c:when>
                                                                        <c:when test="${education == 3}">
                                                                            <option value="3">Cao đẳng</option>
                                                                        </c:when>
                                                                        <c:when test="${education == 4}">
                                                                            <option value="4">Sau đại học</option>
                                                                        </c:when>
                                                                    </c:choose>
                                                                    <option value="1">Trung cấp</option>
                                                                    <option value="2">Đại học</option>
                                                                    <option value="3">Cao đẳng</option>
                                                                    <option value="4">Sau đại học</option>
                                                                </select>
                                                                <label class="form-label"
                                                                       for="education">Education</label>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-12">

                                                            <div class="form-outline">
                                                                <select id="division" name="division"
                                                                        class="select form-control-lg">
                                                                    <c:set var="division" scope="session"
                                                                           value="${employee.getDivision()}"/>
                                                                    <c:choose>
                                                                        <c:when test="${division == 1}">
                                                                            <option value="1">Sale-Marketing</option>
                                                                        </c:when>
                                                                        <c:when test="${division == 2}">
                                                                            <option value="2">Hành Chính</option>
                                                                        </c:when>
                                                                        <c:when test="${division == 3}">
                                                                            <option value="3">Phục Vụ</option>
                                                                        </c:when>
                                                                        <c:when test="${division == 4}">
                                                                            <option value="4">Quản lý</option>
                                                                        </c:when>
                                                                    </c:choose>
                                                                    <option value="1">Sale-Marketing</option>
                                                                    <option value="2">Hành Chính</option>
                                                                    <option value="3">Phục Vụ</option>
                                                                    <option value="4">Quản lý</option>
                                                                </select>
                                                                <label class="form-label"
                                                                       for="division">Division</label>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div class="mt-4 pt-2">
                                                        <button type="submit" name="employAction" value="edit"
                                                                class="btn btn-info">Save
                                                        </button>
                                                        <button class="btn btn-info"><a href="/employee">Cancel</a>
                                                        </button>
                                                    </div>

                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </section>

                    </div>
                </div>
            </div>
        </div>
    </div>


    <%--    Footer--%>
    <div class="row bg-dark ">
        <div class="col-12 d-flex justify-content-center">
            <div class="row">
                <h3>Liên hệ</h3>
                <p>103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam</p>
                <p>Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666</p>
                <p>Email: reservation@furamavietnam.com * www.furamavietnam.com</p>
            </div>
        </div>
    </div>
</div>


<script src="../js/bootstrap.min.js"></script>
</body>
</html>
