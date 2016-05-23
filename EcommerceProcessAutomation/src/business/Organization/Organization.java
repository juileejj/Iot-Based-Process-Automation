/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Organization;

import business.Person.PersonDirectory;
import business.Role.Role;
import business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public abstract class Organization {
       private String name;
    //private WorkQueue workQueue;
    private PersonDirectory personDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    protected ArrayList<Role> roleList;

    public ArrayList<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(ArrayList<Role> roleList) {
        this.roleList = roleList;
    }

    public Organization(String name) {
         this.name = name;
        //workQueue = new WorkQueue();
        personDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        this.roleList= new ArrayList<>();
        ++counter;
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public enum Type{
        Warehouse("Warehouse Organization"),
        Logistics("Logistics Organization"),
        Customer("Customer Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString()
        {
            return this.value;
        }
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
@Override
public String toString()
{
    return this.getName();
}
  
}
