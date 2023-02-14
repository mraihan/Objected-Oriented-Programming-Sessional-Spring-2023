
package pkg20221094010.pkg5.pkg10;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
       double l,c,r;
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the value of R:");
       r = sc.nextDouble();
       System.out.print("Enter the value of LC:");
       l = sc.nextDouble();
       System.out.print("Enter the value of C:");
       c = sc.nextDouble();
       double a =1/l;
       double b =((r*r)/(4*c*c));
       double f;
        f =  Math.sqrt(a-b);
       System.out.print("Frequency is :"+f);   
    }
    
}
