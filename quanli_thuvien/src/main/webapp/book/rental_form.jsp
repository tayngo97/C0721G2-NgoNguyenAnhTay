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
                <a class="text-decoration-none text-light" href="/book">Book</a>
                <a class="text-decoration-none text-light" href="#">Student</a>
                <a class="text-decoration-none text-light" href="#">Rental</a>
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
<%--                        Add New Employee Form--%>
                        <section class="vh-100 gradient-custom">
                            <div class="container py-5 h-100">
                                <div class="row justify-content-center align-items-center h-100">
                                    <div class="col-12 col-lg-9 col-xl-7">
                                        <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
                                            <div class="card-body p-4 p-md-5">
                                                <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Mượn sách</h3>
<%--                                                FORM--%>
                                                <form method="post" action="/book">
                                                    <div class="row">
                                                        <div class="col-md-12 mb-4">

                                                            <div class="form-outline">
                                                                <input type="text" name="name" id="firstName" class="form-control form-control-lg" />
                                                                <label class="form-label" for="firstName">Mã mượn sách</label>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6 mb-4 d-flex align-items-center">

                                                            <div class="form-outline datepicker w-100">
                                                                <input
                                                                        readonly
                                                                        type="text"
                                                                        class="form-control form-control-lg"
                                                                        id="name"
                                                                        name="name"
                                                                        value="${book.getName()}"
                                                                />
                                                                <label for="name" class="form-label">Tên sách</label>
                                                            </div>

                                                        </div>

                                                        <div class="col-md-6 mb-4 d-flex align-items-center">

                                                            <div class="form-outline datepicker w-100">
                                                                <input
                                                                        type="text"
                                                                        class="form-control form-control-lg"
                                                                        id="userName"
                                                                        name="userName"
                                                                />
                                                                <label for="userName" class="form-label">Tên học sinh</label>
                                                            </div>

                                                        </div>
<%--                                                        <div class="col-md-6 mb-4">--%>

<%--                                                            <h6 class="mb-2 pb-1">Gender: </h6>--%>

<%--                                                            <div class="form-check form-check-inline">--%>
<%--                                                                <input--%>
<%--                                                                        class="form-check-input"--%>
<%--                                                                        type="radio"--%>
<%--                                                                        name="inlineRadioOptions"--%>
<%--                                                                        id="femaleGender"--%>
<%--                                                                        value="option1"--%>
<%--                                                                        checked--%>
<%--                                                                />--%>
<%--                                                                <label class="form-check-label" for="femaleGender">Female</label>--%>
<%--                                                            </div>--%>

<%--                                                            <div class="form-check form-check-inline">--%>
<%--                                                                <input--%>
<%--                                                                        class="form-check-input"--%>
<%--                                                                        type="radio"--%>
<%--                                                                        name="inlineRadioOptions"--%>
<%--                                                                        id="maleGender"--%>
<%--                                                                        value="option2"--%>
<%--                                                                />--%>
<%--                                                                <label class="form-check-label" for="maleGender">Male</label>--%>
<%--                                                            </div>--%>

<%--                                                            <div class="form-check form-check-inline">--%>
<%--                                                                <input--%>
<%--                                                                        class="form-check-input"--%>
<%--                                                                        type="radio"--%>
<%--                                                                        name="inlineRadioOptions"--%>
<%--                                                                        id="otherGender"--%>
<%--                                                                        value="option3"--%>
<%--                                                                />--%>
<%--                                                                <label class="form-check-label" for="otherGender">Other</label>--%>
<%--                                                            </div>--%>

<%--                                                        </div>--%>
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6 mb-4 pb-2">

                                                            <div class="form-outline">
                                                                <input type="email" name="email" id="emailAddress" class="form-control form-control-lg" />
                                                                <label class="form-label" for="emailAddress">Ngày mươn sách</label>
                                                            </div>

                                                        </div>
                                                        <div class="col-md-6 mb-4 pb-2">

                                                            <div class="form-outline">
                                                                <input type="number" name="salary" id="salary" class="form-control form-control-lg" />
                                                                <label class="form-label" for="salary">Ngày trả sách</label>
                                                            </div>

                                                        </div>
                                                    </div>

                                                    <div class="mt-4 pt-2">
                                                        <button type="submit" name="employAction" value="create" class="btn btn-info">Mươn sách</button>
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
