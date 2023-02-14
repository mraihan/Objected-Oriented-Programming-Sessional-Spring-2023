package com.mycompany.linearequantions;
import java.util.Scanner;

public class LinearEquantions {
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
