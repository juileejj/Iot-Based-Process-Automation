/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Network.NetworkDirectory;
import business.Organization.Organization;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class EcommerceEcoSystem extends Organization{
 private static EcommerceEcoSystem business;
 private NetworkDirectory networkDirectory;
// private UserAccountDirectory userAccountDirectory;
 
 
    private EcommerceEcoSystem() {
        super(null);
        networkDirectory = new NetworkDirectory();
           
    }

    public NetworkDirectory getNetworkDirectory() {
        return networkDirectory;
    }

    public void setNetworkDirectory(NetworkDirectory networkDirectory) {
        this.networkDirectory = networkDirectory;
    }
 
 public static EcommerceEcoSystem getInstanceOf()
 {
      if(business== null)
        {
            business = new EcommerceEcoSystem();
        }
        return business;
 }

    @Override
    public ArrayList<Role> getSupportedRole() {
      return this.roleList;
    }
 
 
}
