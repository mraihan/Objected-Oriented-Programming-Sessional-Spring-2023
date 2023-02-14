
package work2;

import java.util.Scanner;

public class Work2 {

    public static void main(String[] args) {
        
      Scanner ppp = new Scanner (System.in);
    double n,LC,R,C,m1,m2;
    System.out.print("LC = ");
    LC=ppp.nextDouble();
     System.out.print("R = ");
    R=ppp.nextDouble();
     System.out.print("C = ");
    C=ppp.nextDouble();
    m1=LC/LC;
    m2=R/(4*C);
    m2=m2*m2;
    n=Math.sqrt(m1-m2);
     System.out.println("Frequency = "+n);
      }
    
}
