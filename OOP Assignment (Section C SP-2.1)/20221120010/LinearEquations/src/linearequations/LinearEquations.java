/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linearequations;

/**
 *
 * @author nahid
 */import java.util.Scanner;
public class LinearEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
System.out.print("Enter the value of a: ");
double a = input.nextDouble();
System.out.print("Enter the value of b: ");
double b = input.nextDouble();
System.out.print("Enter the value of c: ");
double c = input.nextDouble();
System.out.print("Enter the value of d: ");
double d = input.nextDouble();
System.out.print("Enter the value of m: ");
double m = input.nextDouble();
System.out.print("Enter the value of n: ");
double n = input.nextDouble();
double denominator = a * d - b * c;
if (denominator == 0) {
System.out.println("The equation has no unique solution as the denominator is zero.");
} else {
double x1 = (m * d - b * n) / denominator;
double x2 = (a * n - m * c) / denominator;
System.out.println("x1 = " + x1 + ", x2 = " + x2);
}
}
}
