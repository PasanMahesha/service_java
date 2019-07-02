/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

/**
 *
 * @author Pasan Mahesha
 */
public class serviceType {
    
    int y2;
    long deff2;
    
    public String serviceType(int y,long deff){
        if (y >= 20000 || deff > 720) {
                return("service one");

                //service 5
                // jTextArea1.setText(rs.getString("serviceA"));
            } else if (y >= 15000 || deff >= 540) {
               /* setVisible(false);
                service_schedule1 ob = new service_schedule1();
                ob.setVisible(true);*/
                //service 4
                // jTextArea1.setText(rs.getString("serviceB"));
            } else if (y >= 10000 || deff >= 360) {
                //service 3                // jTextArea1.setText(rs.getString("serviceC"));
            } else if (y >= 5000 || deff >= 180) {
                //Service 2
                // jTextArea1.setText(rs.getString("serviceD"));
            } else if (y >= 1000 || deff >= 30) {
                //Service 1
                // jTextArea1.setText(rs.getString("serviceE"));
            } else {
                //no need a service
                // jTextArea1.setText("No need a service yet");
            }
        return null;
    }
    
}
