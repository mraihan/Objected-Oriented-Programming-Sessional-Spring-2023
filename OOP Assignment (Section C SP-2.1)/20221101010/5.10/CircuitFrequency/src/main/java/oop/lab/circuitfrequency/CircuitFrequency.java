
package oop.lab.circuitfrequency;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
public class CircuitFrequency {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("\nEnter inductence L: ");
        float l = scan.nextFloat();
        System.out.print("Enter resistance R: ");
        float r = scan.nextFloat();
        
        System.out.print("\n\nCapacitance (C)\tFrequency (F)");
        System.out.print("\n-----------------------------");
        for (float i = (float) 0.01; i<= 0.1; i+=0.01) {
                float f = (float) sqrt((1/l*i)-((r*r)/(4*i*i)));    
                System.out.print("\n" + String.format("%.2f", i) + "\t\t" + String.format("%.5f", f));
            
        }
        scan.close();
    }
}