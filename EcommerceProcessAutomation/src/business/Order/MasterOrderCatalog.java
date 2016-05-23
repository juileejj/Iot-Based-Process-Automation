/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Order;

import business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class MasterOrderCatalog {

    private ArrayList<Order> orderCatalog;
    private Customer customer;

    public MasterOrderCatalog() {
        orderCatalog = new ArrayList<Order>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Order> getOrderCatalog() {
        return orderCatalog;
    }

    public Order addOrder(Order o) {
        orderCatalog.add(o);
        return o;
    }

}
