/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Network;

import business.Customer.CustomerDirectory;
import business.Enterprise.EnterpriseDirectory;
import business.Organization.Organization;
import business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class Network extends Organization {

    private int zipCode;
    private String stateName;
    private EnterpriseDirectory enterpriseDirectory;
    private ArrayList<Network> cityList;
    private String cityName;

    public Network() {
        super(null);
        enterpriseDirectory = new EnterpriseDirectory();

    }

    public Network(String stateName, ArrayList<Network> citylist) {
        super(null);
        this.stateName = stateName;
        this.cityList = citylist;
    }

    public Network addCity(Network n) {
        ArrayList<Network> cities = n.getCityList();
        Network city = new Network();
        cities.add(city);
        return city;
    }

    public void removeCity(Network state, Network city) {
        ArrayList<Network> cities = state.getCityList();
        cities.remove(city);
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStateName() {
        return stateName;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public Network getCityObjectFromName(String cityName, Network state, int zipcode) {

        ArrayList<Network> cList = state.getCityList();
        for (Network city : cList) {
            if (cityName.equals(city.getCityName()) && zipcode == city.getZipCode()) {

                return city;
            }
        }
        return null;
    }

    public ArrayList<Integer> getZipCodeList(String cityName, Network state) {
        ArrayList<Integer> zipList = new ArrayList<>();
        ArrayList<Network> cList = state.getCityList();
        for (Network city : state.getCityList()) {
            if (cityName.equalsIgnoreCase(city.getCityName())) {
                zipList.add(city.getZipCode());
            
            }
        }
        return zipList;
    }

    public ArrayList<Network> getCityWithAllZipcode(Network network, String cityName) {
        ArrayList<Network> tempAllZipList = new ArrayList<>();
        for (Network city : network.getCityList()) {
            if (city.getCityName().equalsIgnoreCase(cityName)) {
                tempAllZipList.add(city);
               
                 return tempAllZipList;
            }

        }
        return tempAllZipList;
    }

    public ArrayList<Network> getCityList() {
        return cityList;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return this.stateName;
    }

    public String toString(Network city) {
        return city.getCityName();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return this.roleList; //To change body of generated methods, choose Tools | Templates.
    }
}
