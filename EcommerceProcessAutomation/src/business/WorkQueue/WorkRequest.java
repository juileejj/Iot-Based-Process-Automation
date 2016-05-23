/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.WorkQueue;

import business.Sensor.Sensor;
import business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Juilee;
 */
public abstract class WorkRequest {

    private String message;
//    private UserAccount sender;
//    private UserAccount receiver;
      private String status;
      private Date requestDate;
      private Sensor sensor;
      private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
}
