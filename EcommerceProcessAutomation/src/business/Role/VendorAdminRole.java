/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Role;

import business.EcommerceEcoSystem;
import business.Enterprise.Enterprise;
import business.Enterprise.VendorStoreEnterprise;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.VendorAdminRole.EnterpriseAdminWorkAreaJPanel;

/**
 *
 * @author Juilee
 */
public class VendorAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcommerceEcoSystem system) {
       return new EnterpriseAdminWorkAreaJPanel(userProcessContainer,(VendorStoreEnterprise)enterprise);
    }
    
}
