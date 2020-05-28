/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author anhma
 */
public class product {

    private int ProductID;
    private String ProductName;
    private int ProductPrice;
    private String ProductDescription_1;
    private String ProductDescription_2;
    private String ProductDescription_3;
    private String ProductImage;

    public product() {
    }

    ;
    public product(int ProductID, String ProductName, int ProductPrice, String ProductDescription_1, String ProductDescription_2, String ProductDescription_3, String ProductImage) {
        super();
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.ProductPrice = ProductPrice;
        this.ProductDescription_1 = ProductDescription_1;
        this.ProductDescription_2 = ProductDescription_2;
        this.ProductDescription_3 = ProductDescription_3;
        this.ProductImage = ProductImage;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(int ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductDescription_1() {
        return ProductDescription_1;
    }

    public void setProductDescription_1(String ProductDescription_1) {
        this.ProductDescription_1 = ProductDescription_1;
    }
    
     public String getProductDescription_2() {
        return ProductDescription_2;
    }

    public void setProductDescription_2(String ProductDescription_2) {
        this.ProductDescription_2 = ProductDescription_2;
    }
    
     public String getProductDescription_3() {
        return ProductDescription_3;
    }

    public void setProductDescription_3(String ProductDescription_3) {
        this.ProductDescription_3 = ProductDescription_3;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }
}
