/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class CustomerOrderCatalog {
    
    private ArrayList<Order> orderCatalog;
    
    public CustomerOrderCatalog() {
        orderCatalog = new ArrayList<>();
    }
    
    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }
    
    public Order addOrder(Order o) {
        orderCatalog.add(o);
        return o;
    }

}
