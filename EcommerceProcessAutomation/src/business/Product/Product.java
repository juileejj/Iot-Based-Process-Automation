/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Product;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 *
 * @author Juilee
 */
public class Product {
   
 private String prodName;
 private int availability;
 private String barcode;
 private float price;
 private String productType;

    public Product() {
        barcode= getProdId();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

   public final String getProdId()
   {
       long numb = (long)(Math.random() * 100000000 * 1000000); // had to use this as int's are to small for a 13 digit number.
        
            return String.valueOf(numb);
   
   }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getBarcode() {
        return barcode;
    }  

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
 
 @Override
 public String toString()
 {
     return this.getProdName();
 }
}
