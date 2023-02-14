
package Task_3;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        double a = scan.nextDouble();
        System.out.print("Enter the value of b = ");
        double b = scan.nextDouble();
        System.out.print("Enter the value of c = ");
        double c = scan.nextDouble();
        System.out.print("Enter the value of d = ");
        double d = scan.nextDouble();
        System.out.print("Enter the value of m = ");
        double m = scan.nextDouble();
        System.out.print("Enter the value of n = ");
        double n = scan.nextDouble();

        double determinant = a * d - b * c;
        if (determinant == 0) {
            System.out.println("Invalid Value!");
        } else {
            double x = (m * d - b * n) / determinant;
            double y = (a * n - m * c) / determinant;
            System.out.println("X = " + x);
            System.out.println("Y = " + y);
        }
    }
}

