/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

/**
 *
 * @author nahid
 */import java.util.Scanner;
public class Distance {

    /**
     * @param args the command line arguments
     */
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