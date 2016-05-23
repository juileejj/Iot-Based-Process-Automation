/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Organization.Organization;
import business.Organization.OrganizationDirectory;
import business.Role.CustomerAdminRole;
import business.Role.CustomerRole;
import business.Role.Role;
import business.Role.VendorAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public abstract class Enterprise extends Organization{
 private String name;
 private OrganizationDirectory organizationDirectory;
    public Enterprise() {
      super(null);
      organizationDirectory= new OrganizationDirectory();
    }
public enum EnterpriseType{
        VendorStore("Vendor Store"),CustomerEnterprise("Customer Enterprise");
        
        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public ArrayList<Role> getSupportedRole() {
//       
//        this.roleList.add(new CustomerAdminRole());
//        this.roleList.add(new VendorAdminRole());
//        this.roleList.add(new CustomerRole());
//       return this.roleList; //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public String toString()
    {
        return this.getName();
    }
}
