/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Customer.CustomerDirectory;
import business.Role.CustomerRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class CustomerOrganization extends Organization {
private CustomerDirectory customerDirectory; 


    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }


    public CustomerOrganization() {
       super(Organization.Type.Customer.getValue());
        customerDirectory= new CustomerDirectory();
        
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        this.roleList.add(new CustomerRole());
        return this.roleList;
//To change body of generated methods, choose Tools | Templates.
    }

}
