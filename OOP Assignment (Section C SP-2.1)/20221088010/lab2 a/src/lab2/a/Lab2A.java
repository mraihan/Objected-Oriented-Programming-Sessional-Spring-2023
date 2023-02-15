
package lab2.a;

import java.util.Scanner;

public class Lab2A {

    public static void main(String[] args) {
        Scanner sss;
        sss = new Scanner(System.in);
        double d,u,a,m,m1,m2;
        System.out.print("u = ");
        u=sss.nextDouble();
        
    System.out.print("a = ");
        a=sss.nextDouble();
        System.out.print("m = ");
        m=sss.nextDouble();
     
       m1=u*m;
       m2=a*m*m;
       m2=m2/2;
       d=m1+m2;
       
    System.out.println("d= "+d );
    }    
}
