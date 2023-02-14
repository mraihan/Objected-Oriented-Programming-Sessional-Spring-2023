
package oop.lab.valueofxs;
import java.util.Scanner; 

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 **/

public class ValueOfXs {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter values for a, b, c, d, m, and n separated by spaces: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        double m = scan.nextDouble();
        double n = scan.nextDouble();
        scan.close();
        
        if (a*d - c*d != 0) {
            double x1 = ((m*d - b*n)/(a*d - c* d));
            double x2 = ((n*a - m*c)/(a*d - c* d));
            System.out.println("\nThe values of x1 and x2 are: ");
            System.out.println("\tx1 = " + x1);
            System.out.println("\tx2 = " + x2);
        }
        else {
            System.out.println("\nThe determinant is zero. Hence, no solution exists.");
        }
    }
}
