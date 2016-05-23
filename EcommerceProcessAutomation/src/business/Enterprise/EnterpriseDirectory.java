/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Enterprise.Enterprise.EnterpriseType;
import business.Organization.LogisticsOrganization;
import business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class EnterpriseDirectory {
    ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList= new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
     public Enterprise createEnterprise(EnterpriseType type){
        Enterprise enterprise = null;
        if (type.getValue().equals(Enterprise.EnterpriseType.VendorStore.getValue())){
            enterprise = new VendorStoreEnterprise();
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Enterprise.EnterpriseType.CustomerEnterprise.getValue())){
            enterprise = new CustomerEnterprise();
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
