
package lab.pkg03;

import java.util.Scanner;

public class Lab03 {

    public static void main(String[] args) {
        double a,b,c,d,e,f,g,m,n,x1,x2;
        Scanner s = new Scanner(System.in);
        System.out.print("a=");
        a=s.nextDouble();
        System.out.print("b=");
        b=s.nextDouble();
        System.out.print("c=");
        c=s.nextDouble();
        System.out.print("d=");
        d=s.nextDouble();
        System.out.print("m=");
        m=s.nextDouble();
        System.out.print("n=");
        n=s.nextDouble();
        if(a*d==c*d)
        {
            System.out.println("error");
        }
        else
        {
            e=(m*d)-(b*n);
            f=(a*d)-(c*d);
            g=(n*a)-(m*c);
            x1=e/f;
            x2=g/f;
            System.out.println("X1="+x1);
            System.out.println("X2="+x2);
        }
        
        
        
    }
    
}
