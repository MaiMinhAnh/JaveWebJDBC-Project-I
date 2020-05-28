/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.productDAO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.product;

/**
 *
 * @author anhma
 */
@WebServlet("/edit-product")
public class EditController extends HttpServlet{
    private static final long serialVersionUID = 1L;
    public EditController(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
    
        int id=Integer.parseInt(request.getParameter("ProductID"));
        product p=new product();                //thêm mới sản phẩm p vào CSDL
        p.setProductID(Integer.parseInt(request.getParameter("ProductID")));
        p.setProductName(request.getParameter("ProductName"));
        p.setProductPrice(Integer.parseInt(request.getParameter("ProductPrice")));
        /*p.setProductDescription_1(request.getParameter("ProductDescription_1"));
        p.setProductDescription_2(request.getParameter("ProductDescription_2"));
        p.setProductDescription_3(request.getParameter("ProductDescription_3"));*/
        
        /*p.setProductDescription(request.getParameter("ProductDescription"));*/
        p.setProductImage(request.getParameter("ProductImage"));
        
        System.out.println(""+request.getParameter("ProductName"));
        productDAO.Update(p);
        response.sendRedirect("index.jsp");
    }
}
