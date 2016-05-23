/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Organization.Organization;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
        customerList= new ArrayList<>();
       
       
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    public Customer addCustomer()
    {
        Customer customer = new Customer();
        customerList.add(customer);
        return customer;    
    }
    public void removeCustomer(Customer c)
    {
        customerList.remove(c);
    }
    public ArrayList<Customer> searchCustomer(String customerName)
            
    {
        ArrayList<Customer> tempcustomerList = new ArrayList<>();
        for(Customer c:customerList)
        {
            if(c.getName().equals(customerName))
            {
                tempcustomerList.add(c);
            }
        }
        return tempcustomerList;
    }
}
