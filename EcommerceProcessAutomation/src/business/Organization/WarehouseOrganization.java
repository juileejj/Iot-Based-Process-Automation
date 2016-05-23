/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.Role;
import business.Role.WarehouseAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class WarehouseOrganization extends Organization{

    public WarehouseOrganization() {
        super(Organization.Type.Warehouse.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
       this.roleList.add(new WarehouseAdminRole());
        return this.roleList; //To change body of generated methods, choose Tools | Templates.;
    }
    
}
