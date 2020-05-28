/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ConnectToDatabase.ConnectToDatabase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.product;

/**
 *
 * @author anhma
 */
public class productDAO {

    //lấy danh sách sản phẩm trong database ra ArrayList
    public static ArrayList<product> getProduct() throws SQLException {
        Connection conn = ConnectToDatabase.getConnect();

        ArrayList<product> spList = new ArrayList<>();
        try {
            ResultSet rs = conn.prepareStatement("select * from product, detail ").executeQuery();
            while (rs.next()) {
                product sp = new product();
                sp.setProductID(rs.getInt("ProductID"));
                sp.setProductName(rs.getString("ProductName"));
                sp.setProductPrice(rs.getInt("ProductPrice"));
                sp.setProductDescription_1(rs.getString("ProductDescription_1"));
                sp.setProductDescription_2(rs.getString("ProductDescription_2"));
                sp.setProductDescription_3(rs.getString("ProductDescription_3"));

                /*sp.setProductDescription(rs.getString("ProductDescription"));*/
                sp.setProductImage(rs.getString("ProductImage"));
                spList.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return spList;
    }

    // thêm mới sản phẩm ào database
    public static boolean Add(product p) {

        Connection conn = ConnectToDatabase.getConnect();
        try {
            String spl1 = "insert into product values(N'" + p.getProductName() + "', N'" + p.getProductPrice() + "', N'" + p.getProductImage() + "')";
            /*String sql2="insert into detail values('"+p.getProductID()+"','" + p.getProductDescription_1() + "','" + p.getProductDescription_2() + "','" + p.getProductDescription_3() + "')";*/
            PreparedStatement stmt1 = conn.prepareStatement(spl1);
            /*PreparedStatement stmt2=conn.prepareStatement(sql2);*/
            stmt1.executeUpdate();
            /*stmt2.executeUpdate();*/
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static product getProductID(int id) throws SQLException {
        Connection conn = ConnectToDatabase.getConnect();
        try {

            ResultSet rs = conn.prepareStatement("select * from product, detail where product.ProductID=" + id).executeQuery();
            product p = new product();
            while (rs.next()) {
                p.setProductID(rs.getInt("ProductID"));
                p.setProductName(rs.getString("ProductName"));
                p.setProductPrice(rs.getInt("ProductPrice"));
                p.setProductDescription_1(rs.getString("ProductDescription_1"));
                p.setProductDescription_2(rs.getString("ProductDescription_2"));
                p.setProductDescription_3(rs.getString("ProductDescription_3"));
                /*p.setProductDescription(rs.getString("ProductDescription"));*/
                p.setProductImage(rs.getString("ProductImage"));

            }
            return p;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean Update(product p) {
        Connection conn = ConnectToDatabase.getConnect();
        try {
            String spl1 = "update product set ProductName=N'" + p.getProductName() + "',ProductPrice=N'" + p.getProductPrice() + "', ProductImage=N'" + p.getProductImage() + "' where product.ProductID='" + p.getProductID() + "'";
            
            PreparedStatement stmt1 = conn.prepareStatement(spl1);
            stmt1.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static boolean Delete(int id) {
        Connection conn = ConnectToDatabase.getConnect();
        try {
            String spl1 = "delete from product where ProductID='" + id + "'";
            
            PreparedStatement stmt1 = conn.prepareStatement(spl1);
            
            stmt1.executeQuery();
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void main(String[] args) throws SQLException {
        //  System.out.println(""+getProduct().size());
        //System.out.println(""+getProduct());
        System.out.println("" + getProductID(20));
    }
}
