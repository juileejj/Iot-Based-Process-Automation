/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.CustomerRole;

import business.Customer.Customer;
import business.EcommerceEcoSystem;
import business.Enterprise.Enterprise;
import business.Network.Network;
import business.UserAccount.UserAccount;
import business.db4OUtil.DB4OUtil;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import userInterface.SystemAdminRole.ManageNetworkJPanel;

/**
 *
 * @author Juilee
 */
public class CustomerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private EcommerceEcoSystem system;
    private Customer customer;
    private DB4OUtil dB4OUtil;

    /**
     * Creates new form CustomerWorkJPanel
     */
    public CustomerWorkAreaJPanel(JPanel userProcessContainer, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.dB4OUtil = DB4OUtil.getInstance();
        customer = (Customer) this.userAccount.getPerson();
        custName.setText(customer.getName());
    }

    public ArrayList<Enterprise> getVendors() {
        ArrayList<Enterprise> enterpriseListForCustomer = new ArrayList<>();
        String cityName = customer.getCityName();
        System.out.println(cityName);
        Network network = customer.getNetwork();
        System.out.println(network);
        ArrayList<Network> allZip = network.getCityWithAllZipcode(network, cityName);
        for (Network city : allZip) {
            for (Enterprise enterprise : city.getEnterpriseDirectory().getEnterpriseList()) {
                enterpriseListForCustomer.add(enterprise);
            }
        }
        return enterpriseListForCustomer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        btnReview = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        custName = new javax.swing.JLabel();
        btnReview1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        btnBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Small-arrow-right-fast-forward-icon.png"))); // NOI18N
        btnBrowse.setText("Browse Products");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnReview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Small-arrow-right-fast-forward-icon.png"))); // NOI18N
        btnReview.setText("Review All Orders");

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userInterface/login-icon.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel2.setText("Customer name");

        btnReview1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Small-arrow-right-fast-forward-icon.png"))); // NOI18N
        btnReview1.setText("Change Account password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogout)
                            .addComponent(btnReview)
                            .addComponent(btnBrowse)
                            .addComponent(btnReview1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(custName)))
                .addGap(371, 371, 371))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(custName))
                .addGap(56, 56, 56)
                .addComponent(btnBrowse)
                .addGap(18, 18, 18)
                .addComponent(btnReview)
                .addGap(7, 7, 7)
                .addComponent(btnReview1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout)
                .addGap(276, 276, 276))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        ArrayList<Enterprise> enterpriseList = this.getVendors();
        BrowseProductsJPanel panel = new BrowseProductsJPanel(userProcessContainer, userAccount, enterpriseList);
        userProcessContainer.add("BrowseProductsJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);  // TODO add your handling code here:
    }//GEN-LAST:event_btnBrowseActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        system = EcommerceEcoSystem.getInstanceOf();
        dB4OUtil.storeSystem(system);  // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReview;
    private javax.swing.JButton btnReview1;
    private javax.swing.JLabel custName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
