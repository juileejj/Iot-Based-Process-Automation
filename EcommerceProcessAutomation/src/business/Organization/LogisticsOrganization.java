/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Role.LogisticsAdminRole;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class LogisticsOrganization extends Organization{

    public LogisticsOrganization() {
        super(Organization.Type.Logistics.getValue());
    }

    
    @Override
    public ArrayList<Role> getSupportedRole() {
    this.roleList.add( new LogisticsAdminRole());
        return this.roleList;     
    }
    
}
