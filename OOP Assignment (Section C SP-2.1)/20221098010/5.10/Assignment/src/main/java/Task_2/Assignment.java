
package Task_2;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

 
        Scanner scan = new Scanner(System.in); 
        
        double LC = scan.nextDouble(), R = scan.nextDouble(), C = scan.nextDouble();
        
        double F = 1 / (2 * Math.PI * Math.sqrt(LC * C) * (R + Math.sqrt(R * R + 4 * Math.PI * Math.PI * LC * C)));
        
        System.out.println("Frequency = " + F);
        
    }
    
}
