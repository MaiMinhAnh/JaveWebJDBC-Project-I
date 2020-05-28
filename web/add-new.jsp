<%-- 
    Document   : add-new
    Created on : Dec 14, 2019, 10:56:50 PM
    Author     : anhma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thêm mới sản phẩm</title>
        <link href="lib/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link href="css/top-bar.css" rel="stylesheet" type="text/css"/>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <link href="css/content.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
        <link href="css/add-new.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="top-bar.jsp"></jsp:include>
        <jsp:include page="header-add-new.jsp"></jsp:include>
        <br>
        <br>
        <br>
        <!--phần form thêm mới-->
        <div class="container">
            <form action="add-product" method="post">
                <div class="form-group">
                    <label>Tên sản phẩm: </label>
                    <input type="text" class="form-control" placeholder="Tên sản phẩm" name="ProductName">
                </div>
                
                <div class="form-group">
                    <label>Giá tiền: </label>
                    <input type="text" class="form-control" placeholder="Giá tiền" name="ProductPrice">
                </div>
                <!--
                <div class="form-group">
                    <label>Chi tiết sản phẩm: </label>
                    <input type="text" class="form-control" placeholder="Mô tả 1" name="ProductDescription_1">
                    <input type="text" class="form-control" placeholder="Mô tả 2" name="ProductDescription_2">
                    <input type="text" class="form-control" placeholder="Mô tả 3" name="ProductDescription_3">
                </div>
                -->
                <div class="form-group">
                    <label>Hình ảnh: </label>
                    <input type="text" class="form-control" placeholder="Đường dẫn link ảnh" name="ProductImage">
                </div>
                
                <button type="submit">Lưu</button>
                <button><a href="index.jsp" style="color: #000">Trở lại</a></button>
            </form>
        </div>
        
        
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
