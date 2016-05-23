/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Enterprise.Enterprise;
import business.Enterprise.VendorStoreEnterprise;
import business.Product.Product;

/**
 *
 * @author Juilee
 */
public class OrderItem {

    private Product product;
    private int quantity;
    private float salesPrice;
    //private VendorStoreEnterprise vendorStoreEnterprise;

   
    
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(float salesPrice) {
        this.salesPrice = salesPrice;
    }

    @Override
    public String toString() {
        return this.getProduct().getProdName();
    }
}
