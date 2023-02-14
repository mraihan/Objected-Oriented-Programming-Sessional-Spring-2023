
package oop.lab.distancecalculator;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("\nEnter the initial velocity u (m/s): ");
            double u = scan.nextDouble();

            System.out.print("Enter the acceleration a (m/s^2): ");
            double a = scan.nextDouble();

            System.out.print("Enter the travel time t (s): ");
            double t = scan.nextDouble();

            System.out.print("\nEnter the time interval (s): ");
            double timeInterval = scan.nextDouble();

            System.out.println("\nTime (s)\tDistance (m)");
            System.out.println("----------------------------");

            for (double time = 0; time <= t; time += timeInterval) {
                double distance = u * time + (a * time * time) / 2;
                System.out.println(time + "\t\t" + distance);
            }

            if(t%timeInterval != 0 ){
                double distance = u * t + (a * t * t) / 2;
                System.out.println(t + "\t\t" + distance);
                }

            System.out.print("\nDo you want to continue (y/n)? ");
            choice = scan.next();
        }

        System.out.println("Exiting the program...");
        scan.close();
    }
}
