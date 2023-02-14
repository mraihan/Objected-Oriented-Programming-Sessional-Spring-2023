
package com.mycompany.assignment1;

import java.util.Scanner;


public class Assignment1 {

    public static void main(String[] args) {
        
   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of u: ");
        double u = sc.nextDouble();
        
        System.out.print("Enter the value of a: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter the value of t: ");
        double t = sc.nextDouble();
        
        double s = u * t + 0.5 * a * t * t;
        
        System.out.println("The value of s is: " + s); 
        
        
    }
}
