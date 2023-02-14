package com.mycompany.distancetraveled;

import java.util.Scanner;

public class DistanceTraveled {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the initial velocity (in meters/second): ");
        double u = input.nextDouble();

        System.out.print("Enter the acceleration (in meters/second^2): ");
        double a = input.nextDouble();

        System.out.print("Enter the time interval (in seconds): ");
        double t = input.nextDouble();

        double distance = u * t + (a * t * t) / 2;

        System.out.println("The distance traveled is: " + distance + " meters");
        
    }
}

