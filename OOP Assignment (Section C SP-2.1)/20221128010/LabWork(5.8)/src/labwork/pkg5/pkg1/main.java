
package labwork.pkg5.pkg1;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double d,u,a,t;
        
        System.out.print("Enter the value of u = ");
        u=scan.nextDouble();
        
        System.out.print("Enter the value of a = ");
        a=scan.nextDouble();
        
        System.out.print("Enter the value of t = ");
        t=scan.nextDouble(); 
        
        d=(u*t)+((a*t*t)/2); 
        
        System.out.println("Distance = "+d);
        
    }
    
}