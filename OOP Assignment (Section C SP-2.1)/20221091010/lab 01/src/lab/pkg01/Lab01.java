
package lab.pkg01;

import java.util.Scanner;

public class Lab01 {

  
    public static void main(String[] args) {
        double a,b,c,d,u,t;
        Scanner s = new Scanner(System.in);
        System.out.print("a=");
        a=s.nextDouble();
        System.out.print("u=");
        u=s.nextDouble();
        System.out.print("t=");
        t=s.nextDouble();
        b=u*t;
        c=a*t*t;
        c=c/2;
        d=b+c;
        System.out.println("d="+d);
        
        
    }
    
}
