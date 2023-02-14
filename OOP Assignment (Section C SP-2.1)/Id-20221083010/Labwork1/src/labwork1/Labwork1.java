
package labwork1;

import java.util.Scanner;
public class Labwork1 {

   
    public static void main(String[] args) {
       
        Scanner sss = new Scanner(System.in);
        double a,b,c,d,u,t;
        System.out.print("a=");
        a=sss.nextDouble();
        System.out.print("u=");
        u=sss.nextDouble();
        System.out.print("t=");
        t=sss.nextDouble();
        b=u*t;
        c=a*t*t;
        c=c/2;
        d=b+c;
        System.out.println("d="+d);
        
        
    }
    
}
