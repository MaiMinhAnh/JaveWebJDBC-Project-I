<%-- 
    Document   : index
    Created on : Dec 14, 2019, 9:43:07 PM
    Author     : anhma
--%>
<%@page import="model.product"%>
<%@page import="dao.productDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Project I</title>
        <link href="lib/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link href="css/top-bar.css" rel="stylesheet" type="text/css"/>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <link href="css/content.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="top-bar.jsp"></jsp:include>
        <jsp:include page="header.jsp"></jsp:include>

            <!--phần content-->
            <div id="content" class="site-content" tabindex="-1">
                <div class="container">
                    <div class="site-content-inner">
                        <div class="content-area">
                            <main class="site-main">
                                <br>
                                <br>
                                <ul class="products row columns_wide--5">
                                <%for (product p : productDAO.getProduct()) {%>
                                <li class="product type-product p1 col-md-4">
                                    <div class="product-header"> 
                                        <a href="detail.jsp?id=<%=p.getProductID() %>">
                                            <h4 class="product-title"><%=p.getProductName()%></h4>
                                            <div class="product-thumbnail">
                                                <img src="<%=p.getProductImage()%>" alt=""/>
                                            </div>
                                        </a>
                                    </div>
                                    <div class="product-footer">
                                        <div class="price-add-to-cart"></div>
                                        <span class="price" style=" font-size: 25px; color: red "><%=p.getProductPrice()%> VNĐ</span>
                                        <button><a href="edit.jsp?id=<%=p.getProductID() %>">Sửa</a></button>
                                        <button><a href="DeleteServlet?id=<%=p.getProductID() %>">Xóa</a></button>
                                        
                                    </div>
                                    <br>
                                    <br>
                                </li>
                                <%}%>
                            </ul>
                        </main>
                    </div>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
