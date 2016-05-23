/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.Sensor;

/**
 *
 * @author Juilee
 */
public class Sensor {

    private float threshold;

    public enum SensorType {

        RFIDSensor("RFID Sensor"),
        TemperatureSensor("Temperature Sensor"),
        HumiditySensor("Humidity Sensor"),
        TrackingSensor("Tracking Sensor"),
        QualitySensor("Quality Sensor"),
        QuantitySensor("Quantity Sensor");
        private String value;

        private SensorType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public float getThreshold() {
        return threshold;
    }

    public void setThreshold(float threshold) {
        this.threshold = threshold;
    }

}
