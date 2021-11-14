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
                            <table border="2" >
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Birthday</th>
                                    <th>Salary</th>
                                    <th>PhoneNumber</th>
                                    <th>Email</th>
                                    <th>Address</th>
                                    <th>Position</th>
                                    <th>Education</th>
                                    <th>Division</th>
                                    <th>Username</th>
                                    <th>Edit</th>
                                    <th>Delete</th>
                                </tr>
                                    <tr>
                                        <td>${employee1.getId()}</td>
                                        <td>${employee1.getName()}</td>
                                        <td>${employee1.getBirthday()}</td>
                                        <td>${employee1.getSalary()}</td>
                                        <td>${employee1.getPhoneNumberl()}</td>
                                        <td>${employee1.getEmail()}</td>
                                        <td>${employee1.getAdress()}</td>
                                        <td>${employee1.getPosition()}</td>
                                        <td>${employee1.getEducation_degree()}</td>
                                        <td>${employee1.getDivision()}</td>
                                        <td>${employee1.getUserName()}</td>
                                        <td><a href="/employee?employAction=edit&id=${employee.getId()}">Edit</a></td>
                                            <%--                                        <td><a href="/employee?employAction=delete&id=${employee.getId()}">Delete</a></td>--%>
                                        <td><!-- Button trigger modal -->
                                            <button type="button" class="btn btn-danger" data-toggle="modal" data-target="#exampleModal-${employee.getId()}">
                                                Delete
                                            </button>
                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal-${employee.getId()}" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            Bán có muốn xóa employee có tên là : ${employee.name}
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                                                            <a href="/employee?employAction=delete&id=${employee.getId()}">Delete</a>
                                                                <%--                                                            <button type="button"  class="btn btn-primary">Save changes</button>--%>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                            </table>

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
