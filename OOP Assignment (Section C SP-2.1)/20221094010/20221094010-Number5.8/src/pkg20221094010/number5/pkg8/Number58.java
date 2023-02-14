
package pkg20221094010.number5.pkg8;

import java.util.Scanner;

public class Number58 {

    public static void main(String[] args) {
      int u,t,a,d;
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter acceleration value a (meter/second*second):");
      a = sc.nextInt();
      System.out.println("Enter time value t in second : ");
      t = sc.nextInt();
      System.out.println("Enter initial velocity value u in meter: ");
      u = sc.nextInt();
      d = ((u*t)+(((a*t)*(a*t))/2));
      System.out.println("Total distance is :"+d +" meters");
    }
    
}
