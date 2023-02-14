
package com.mycompany.dampedfrequency;

public class Dampedfrequency {

    public static void main(String[] args) {
        double L = 1; // value of inductance L
        double R = 0.5; // value of resistance R
        double C; // variable for capacitance C
        double frequency; // variable for frequency
        
        for (C = 0.01; C <= 0.1; C += 0.01) {
            frequency = Math.sqrt(1/(L*C) - Math.pow(R, 2)/(4*Math.pow(C, 2)));
            System.out.println("For C = " + C + ", Frequency = " + frequency);
        }
    }
}
    

