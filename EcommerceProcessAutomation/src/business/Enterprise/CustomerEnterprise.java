/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Customer.CustomerDirectory;
import business.Role.CustomerAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class CustomerEnterprise extends Enterprise{
   


    @Override
    public ArrayList<Role> getSupportedRole() {
       this.roleList.add(new CustomerAdminRole());
       return roleList;//To change body of generated methods, choose Tools | Templates.
    }
}
