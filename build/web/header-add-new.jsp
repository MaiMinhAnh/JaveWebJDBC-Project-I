<%-- 
    Document   : header
    Created on : Dec 14, 2019, 9:55:09 PM
    Author     : anhma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="lib/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" >
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <link href="css/top-bar.css" rel="stylesheet" type="text/css"/>
        <link href="css/header.css" rel="stylesheet" type="text/css"/>
        <link href="css/content.css" rel="stylesheet" type="text/css"/>
        <link href="css/footer.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header class="site-header">
            <div class="container hidden-lg-down">
                <div class="masthead">
                    <div class="header-logo" style="float: left">
                        <a class="header-logo-link" href="index.jsp">
                            <img src="Images/logo-bonn.png" alt="" height="100" width="300"/>
                        </a>
                    </div>
                    <form class="navbar-search">
                        <div class="input-group">
                            <div class="input-search">
                                <span style="position: relative; display: inline-block; width: 700px">
                                    <input type="text" class="form-control add-new-header" placeholder="Tìm kiếm sản phẩm" ">
                                </span>
                            </div>
                        </div>
                    </form>
                </div>
                <div class="electro-navigation">
                    <div class="secondary-nav-menu electro-animate-dropdown">
                        <ul class="secondary-nav">
                            <li class="menu-item menu-item-type-custom">
                                <a title="Danh mục sản phẩm" href="index.jsp">Danh mục sản phẩm</a>
                            </li>
                            <li class="menu-item menu-item-type-custom">
                                <a title="Khuyến mại HOT" href="index.jsp">Khuyến mại HOT</a>
                            </li>
                            <li class="menu-item menu-item-type-custom">
                                <a title="Bó hoa tươi" href="index.jsp">Bó hoa tươi</a>
                            </li>
                            <li class="menu-item menu-item-type-custom">
                                <a title="Lãng hoa tươi" href="index.jsp">Lãng hoa tươi</a>
                            </li>
                            <li class="menu-item menu-item-type-custom">
                                <a title="Bình hoa tươi" href="index.jsp">Bình hoa tươi</a>
                            </li>
                            
                        </ul>
                    </div>
                </div>
                <div>

                </div>
            </div>

        </header>
    </body>
</html>
