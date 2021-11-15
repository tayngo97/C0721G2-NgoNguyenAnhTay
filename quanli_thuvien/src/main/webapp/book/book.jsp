<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
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
                <a href="/home.jsp"><img src="../images/logo.svg"></a>
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
                <a class="text-decoration-none text-light" href="/book">Book</a>
                <a class="text-decoration-none text-light" href="#">Student</a>
                <a class="text-decoration-none text-light" href="#">RentalCard</a>
            </div>

            <div class="col-4 ">
                <div class="row d-flex align-items-center">
                    <form class="form-inline d-flex align-items-center justify-content-lg-end">
                        <input class="form-control mr-sm-2 w-50" type="number" placeholder="Search" aria-label="Search">
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
                        <h1>Book List</h1>
                        <%--                        <p><a href="/employee?employAction=create">Add new Employee</a></p>--%>
                        <%--                        <p><a href="/employee?employAction=sort">Sort by Name</a></p>--%>
                        <form action="/book?bookAction=search" method="post">
                            <table>
                                <tr>
                                    <td><input type="number" name="id" id="id" placeholder="Enter id "></td>
                                    <td>
                                        <button type="submit">Search</button>
                                    </td>
                                </tr>
                            </table>
                        </form>
                        <p>
                            <button type="button" class="btn btn-success" data-toggle="modal">
                                <a style="color: #191c1f" href="/book?bookAction=create">Add new Book</a>
                            </button>
                        </p>
                        <p>
                            <button type="button" class="btn btn-warning" data-toggle="modal">
                                <a href="/book?bookAction=sort">Sort by Name</a>
                            </button>
                        </p>
                        <form method="post">
                            <table border="2">
                                <tr>
                                    <th>ID</th>
                                    <th>Name</th>
                                    <th>Author</th>
                                    <th>Description</th>
                                    <th>Quantity</th>
                                </tr>
                                <c:forEach var="book" items="${bookList}">
                                    <tr>
                                        <td>${book.getId()}</td>
                                        <td>${book.getName()}</td>
                                        <td>${book.getAuthor()}</td>
                                        <td>${book.getDescription()}</td>
                                        <td>${book.getQuantity()}</td>
                                        <td>
                                            <button type="button" class="btn btn-success" data-toggle="modal">
                                                <a href="/book?bookAction=rental&id=${book.getId()}"
                                                   style="color: white;text-decoration: none">Mượn</a>
                                            </button>
                                        </td>
                                        <td>
                                            <button type="button" class="btn btn-info" data-toggle="modal">
                                                <a href="/book?bookAction=edit&id=${book.getId()}" style="color: white;text-decoration: none">Edit</a></button>
                                        </td>
                                            <%--                                        <td><a href="/employee? =delete&id=${employee.getId()}">Delete</a></td>--%>
                                        <td><!-- Button trigger modal -->
                                            <button type="button" class="btn btn-danger" data-toggle="modal"
                                                    data-target="#exampleModal-${book.getId()}">
                                                Delete
                                            </button>
                                            <!-- Modal -->
                                            <div class="modal fade" id="exampleModal-${book.getId()}" tabindex="-1"
                                                 role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                <div class="modal-dialog" role="document">
                                                    <div class="modal-content">
                                                        <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">Modal
                                                                title</h5>
                                                            <button type="button" class="close" data-dismiss="modal"
                                                                    aria-label="Close">
                                                                <span aria-hidden="true">&times;</span>
                                                            </button>
                                                        </div>
                                                        <div class="modal-body">
                                                            Bán có muốn xóa book có tên là : ${book.name}
                                                        </div>
                                                        <div class="modal-footer">
                                                            <button type="button" class="btn btn-secondary"
                                                                    data-dismiss="modal">Cancel
                                                            </button>
                                                            <a href="/book?bookAction=delete&id=${book.getId()}">Delete</a>
                                                                <%--                                                            <button type="button"  class="btn btn-primary">Save changes</button>--%>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </td>
                                    </tr>
                                </c:forEach>
                            </table>

                            <select>
                                <option value="1">Lễ tân</option>
                                <option value="2">Lễ tân</option>
                                <option value="3">Lễ tân</option>
                            </select>
                        </form>
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
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>
