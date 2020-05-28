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
@WebServlet("/delete")
public class DeleteController extends HttpServlet{
    /*
    private static final long serialVersionUID = 1L;
    public DeleteController(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException{
    
        int id=Integer.parseInt(request.getParameter("id"));
        product p=new product();                //xóa
        p.setProductID(Integer.parseInt(request.getParameter("id")));
        
        productDAO.Delete(id);
        response.sendRedirect("index.jsp");
        
    }
    */
}
