<%-- 
    Document   : detail
    Created on : Dec 14, 2019, 11:24:53 PM
    Author     : anhma
--%>

<%@page import="dao.productDAO"%>
<%@page import="model.product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Chi tiết sản phẩm</title>
        <link href="lib/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    </head>
    <body>
        <jsp:include page="top-bar.jsp"></jsp:include>
        <jsp:include page="header.jsp"></jsp:include>
            <!--phần content-->
            <div class="container" style="position: relative; top: 100px">
                <div class="site-content-inner">
                <%
                    int id = Integer.parseInt(request.getParameter("id"));
                    product p = productDAO.getProductID(id);
                %>

                <div class="content-area" id="primary">
                    <main class="site-main" id="main">
                        <div class="product-images-detail" style="float: left; padding-right: 30px;  ">
                            <img src="<%=p.getProductImage() %>" style="height: 450px; width: 450px;"/>
                        </div>
                        <div class="detail">
                            <div class="product-title" style="font-size: 30px; border-bottom: 1px solid #ddd; padding-bottom: 20px"><%=p.getProductName() %></div>
                            <br>
                            <br>
                            <div class="">
                                <p style="font-size: 15px; color: #7d7d7d"><%=p.getProductDescription_1() %></p>
                                <br>
                                <p style="font-size: 15px; color: #7d7d7d"><%=p.getProductDescription_2() %></p>
                                <br>
                                <p style="font-size: 15px; color: #7d7d7d"><%=p.getProductDescription_3() %></p>
                            </div>
                            <div class="product-price" style="position: relative; top: 85px; color: #fed700"><h1><%=p.getProductPrice() %> VNĐ</h1></div>
                        </div>

                    </main>
                </div>
            </div>
        </div>

        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
