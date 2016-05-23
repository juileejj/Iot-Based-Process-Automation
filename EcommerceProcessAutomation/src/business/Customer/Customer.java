/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Customer;

import business.Network.Network;
import business.Order.CustomerOrderCatalog;
import business.Person.Person;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Juilee
 */
public class Customer extends Person {

    private static int count = 1000;
    private String cityName;
    //private String stateName;
    private int zipcode;
    private String customerId;
    private String emailId;
    private Date dateOfBirth;
    private int phoneNo;
    private CustomerOrderCatalog customerOrderCatalog;
    private Network network;

    public Customer() {

        customerId = getCustId();
        customerOrderCatalog = new CustomerOrderCatalog();
    }

    public CustomerOrderCatalog getCustomerOrderCatalog() {
        return customerOrderCatalog;
    }

    public void setCustomerOrderCatalog(CustomerOrderCatalog customerOrderCatalog) {
        this.customerOrderCatalog = customerOrderCatalog;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getCustId() {
        String dateString = null;
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");

            dateString = format.format(new Date().getTime());
            count++;
            dateString = dateString + count;
        } catch (Exception ex) {

        }
        return dateString;
    }

    public String getCustomerId() {
        return customerId;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
