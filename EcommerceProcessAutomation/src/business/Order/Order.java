/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Product.Product;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Juilee
 */
public class Order {

    private ArrayList<OrderItem> orderItemList;
    private String orderNumber;
    private Date orderDate;

    public Order() {
        orderItemList = new ArrayList<>();
        this.orderNumber=getOrderId();
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public final String getOrderId() {
        long numb = (long) (Math.random() * 10000000 * 100000); // had to use this as int's are to small for a 13 digit number.

        return String.valueOf(numb);

    }
    public OrderItem addOrderItem(Product p, int q,float price) {
        OrderItem o = new OrderItem();
        o.setProduct(p);
        o.setQuantity(q);
        o.setSalesPrice(q);
        orderItemList.add(o);
        return o;
    }
    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }
}
