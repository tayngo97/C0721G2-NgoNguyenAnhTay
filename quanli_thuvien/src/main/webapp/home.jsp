<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/furama_css.css">
</head>
<body>

<div class="container position-relative">
    <%--    NAV-BAR--%>
    <div class="row bg-dark rounded-3">
        <div class="col-3">
            <%--          Logo--%>
            <div class="row">
                <a href="#"><img src="images/logo.svg"></a>
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
    <div class="row bg-black mt-1 mb-1 rounded-3 task-bar">
        <div class="row d-flex d-inline align-items-center">

            <div class="col-8 d-flex d-inline justify-content-lg-around align-items-center">
                <a class="text-decoration-none text-light" href="#">Home</a>
                <a class="text-decoration-none text-light" href="/book">Book</a>
                <a class="text-decoration-none text-light" href="#">Student</a>
                <a class="text-decoration-none text-light" href="#">Rental</a></div>

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


        <%--      SIDE-BAR--%>
    <div class="row h-100 rounded-3 ">
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
        <div class="col-9 rounded-3 bg-dark">
            <div class="row">
                <div class="col-12">
                    <div class="row">
                        <div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="carousel">
                            <div class="carousel-indicators">
                                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
                                <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
                            </div>
                            <div class="carousel-inner">
                                <div class="carousel-item active">
                                    <img src="images/nuoi-duong-tinh-yeu-doc-sach-640x430.png" class="d-block w-100" alt="...">
                                    <div class="carousel-caption d-none d-md-block">
                                        <h5>First slide label</h5>
                                        <p>Some representative placeholder content for the first slide.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="images/photo1602127619982-16021276201931567617424.jpg" class="d-block w-100" alt="...">
                                    <div class="carousel-caption d-none d-md-block">
                                        <h5>Second slide label</h5>
                                        <p>Some representative placeholder content for the second slide.</p>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img src="images/images.jfif" class="d-block w-100" alt="...">
                                    <div class="carousel-caption d-none d-md-block">
                                        <h5>Le Paul Restaurant</h5>
                                        <p>Đến với Le Paul Restaurant, bạn sẽ được đón tiếp bởi đội ngũ nhân viên nhiệt tình,
                                            phục vụ chu đáo từ việc đặt bàn cho đến chất lượng những món ăn. Không gian quán khá rộng rãi.
                                            Bạn có thể lựa chọn không gian trong nhà nếu muốn sự ấm cúng.
                                            Hoặc có thể tụ tập ở ngoài trời nếu muốn không khí thoáng đãng.</p>
                                    </div>
                                </div>
                            </div>
                            <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
                                <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Previous</span>
                            </button>
                            <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
                                <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                <span class="visually-hidden">Next</span>
                            </button>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>



<%--    Footer--%>
    <div class="row rounded-3 bg-dark ">
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


<script src="js/bootstrap.min.js"></script>
</body>
</html>
