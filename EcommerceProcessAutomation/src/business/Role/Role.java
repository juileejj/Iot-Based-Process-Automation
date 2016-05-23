/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcommerceEcoSystem;
import business.Enterprise.Enterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Juilee
 */
public abstract class Role {
    
    public enum RoleType{
        CustomerAdmin("Customer Admin"),
        VendorAdmin("Vendor Admin"),
        WarehouseAdmin("Warehouse Admin"),
        LogisticsAdmin("Logistics Admin"),
        Customer("Customer");
        
        private String value;
        private RoleType(String value){
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
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcommerceEcoSystem system);

    @Override
    public String toString() {
        return this.getClass().getName();
        
    }
    
}
