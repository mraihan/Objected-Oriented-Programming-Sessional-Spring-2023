
package lab2.b;

import java.util.Scanner;

public class Lab2B {

    public static void main(String[] args) {
      Scanner sss= new Scanner(System.in);
      double f,l,r,c,m1,m2;
      System.out.print("LC = ");
      l= sss.nextDouble();
      System.out.print("R = ");
      r= sss.nextDouble();
       System.out.print("C = ");
      c= sss.nextDouble();
      m1=l/l;
      m2= r/(4*c);
      m2=m2*m2;
      f=Math.sqrt(m1-m2);
      System.out.println("F = "+f);
    }
    
}
