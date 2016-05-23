/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

import java.util.ArrayList;

/**
 *
 * @author Juilee
 */
public class SensorDirectory {
    private ArrayList<Sensor> sensorList;

    public SensorDirectory() {
        sensorList= new ArrayList<>();
    }

    public ArrayList<Sensor> getSensorList() {
        return sensorList;
    }

    public void setSensorList(ArrayList<Sensor> sensorList) {
        this.sensorList = sensorList;
    }
    
}
