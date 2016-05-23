/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Enterprise;

import business.Order.MasterOrderCatalog;
import business.Product.ProductCatalog;
import business.Role.Role;
import business.Role.VendorAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class VendorStoreEnterprise extends Enterprise {

    private ProductCatalog productCatalog;
    private MasterOrderCatalog masterOrderCatalog;

    public VendorStoreEnterprise() {
        productCatalog = new ProductCatalog();
        masterOrderCatalog = new MasterOrderCatalog();
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        this.roleList.add(new VendorAdminRole());
        return roleList;//To change body of generated methods, choose Tools | Templates.
    }
}
