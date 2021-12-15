<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <style>
        p {
            color: red;
        }

        select, input {
            width: 100%;
        }
    </style>
</head>
<body>
<div class="container">
    <form:form action="" method="post" modelAttribute="tokhaiyte">
        <div class="row">
            <div class="header col-12">
                <h2>TỜ KHAI Y TÊ</h2>
                <h4>ĐÂY LÀ TÀI LIỆU QUAN TRỌNG,THÔNG TIN SẼ GIÚP CƠ QUAN Y TẾ LIÊN LẠC KHI CẦN THIẾT</h4>
                <p>Khuyến cáo: Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lý hình
                    sự</p>
            </div>
        </div>

        <div class="row">
            <div class="hoten">
                <h4>Họ tên</h4>
                <form:input path="hoTen"/>
            </div>
        </div>

        <div class="row d-flex">
            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        Năm sinh
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:select path="NamSinh">
                            <form:options items="${namSinh}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>

            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        Giới tính
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:select path="gender">
                            <form:options items="${gender}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>

            <div class="col-4">
                <div class="row">
                    <div class="col-12">
                        Quốc tích
                    </div>
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:select path="quocTich">
                            <form:options items="${quoctich}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <h3>Thông tin đi lại</h3>
            <div class="col-6 d-flex">
                <form:radiobuttons path="thongTinDiLai" items="${thongTinDiLai}"/>
            </div>
        </div>

        <div class="row d-flex">
            <div class="col-6">
                <div class="row">
                    Ngày khởi hành
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:input path="ngayKH" type="date"></form:input>
                    </div>
                </div>
            </div>

            <div class="col-6">
                <div class="row">
                    Ngày kết thúc
                </div>
                <div class="row">
                    <div class="col-12">
                        <form:input path="ngayKT" type="date"></form:input>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="row">
                Địa chỉ liên lạc
            </div>
            <div class="row">
                <div class="col-4">
                    <h4>Tỉnh/thành</h4>
                    <div class="col-12">
                        <form:select path="thanhpho">
                            <form:options items="${thanhPho}"></form:options>
                        </form:select>
                    </div>
                </div>
                <div class="col-4">
                    <h4>Quận/huyện</h4>
                    <div class="col-12">
                        <form:select path="quan">
                            <form:options items="${quan}"></form:options>
                        </form:select>
                    </div>
                </div>
                <div class="col-4">
                    <h4>Phường/xã</h4>
                    <div class="col-12">
                        <form:select path="xa">
                            <form:options items="${xa}"></form:options>
                        </form:select>
                    </div>
                </div>
            </div>
        </div>

        <div class="row">
            <h4>Trong vòng 14 ngày qua , Anh/chị có thấy xuất hiện dấu hiệu nào sau đây không ?</h4>
            <div class="col-6">
                <table>
                    <tr>
                        <th>Triệu chứng</th>
                        <th>Có</th>
                        <th>Không</th>
                    </tr>
                    <tr>
                        <td>Sốt</td>
                        <td>
                            <form:radiobuttons path=""></form:radiobuttons>
                        </td>
                        <td></td>
                    </tr>
                    <tr></tr>
                    <tr></tr>
                </table>
            </div>
            <div class="col-6"></div>
        </div>


    </form:form>
</div>


<link rel="stylesheet" href="js/bootstrap.min.js">
</body>
</html>
