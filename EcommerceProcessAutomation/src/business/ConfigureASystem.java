/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.Person.Person;
import business.Role.SystemAdminRole;
import business.UserAccount.UserAccount;
import static java.time.Clock.system;

/**
 *
 * @author Juilee
 */
public class ConfigureASystem {
   public static EcommerceEcoSystem configure()
   {
      EcommerceEcoSystem business= EcommerceEcoSystem.getInstanceOf();
       //user accounts
      
        
        Person person = business.getPersonDirectory().createPerson("Teja Bhai");
        
        UserAccount ua = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());
       
       return business;
   }
}
