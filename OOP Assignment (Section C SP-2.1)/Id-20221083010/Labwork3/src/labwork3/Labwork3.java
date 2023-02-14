
package labwork3;

import java.util.Scanner;
public class Labwork3 {

   
    public static void main(String[] args) {
        Scanner sss=new Scanner(System.in);
        double a,b,c,d,e,f,t1,t2,t3,x1,x2;
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
        t2=s.nextDouble();
        System.out.print("n=");
        t3=s.nextDouble();
        if(a*d==c*d)
        {
            System.out.println("error");
        }
        else
        {
            e=(t2*d)-(b*t3);
            f=(a*d)-(c*d);
            t1=(t3*a)-(t2*c);
            x1=e/f;
            x2=t1/f;
            System.out.println("X1="+x1);
            System.out.println("X2="+x2);
        }
        
             
    } 
}
