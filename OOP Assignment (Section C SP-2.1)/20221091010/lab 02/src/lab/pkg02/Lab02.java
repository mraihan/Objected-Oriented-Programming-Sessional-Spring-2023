
package lab.pkg02;

import java.util.Scanner;

public class Lab02 {

    public static void main(String[] args) {
       double a,b,c,f,l,r;
        Scanner s = new Scanner(System.in);
        System.out.print("LC=");
        l=s.nextDouble();
        System.out.print("R=");
        r=s.nextDouble();
        System.out.print("C=");
        c=s.nextDouble();
        a=1/l;
        b=r/(2*c);
        b=b*b;
        f=Math.sqrt(a-b);
        System.out.println("F="+f);
        
         
    }
    
}
