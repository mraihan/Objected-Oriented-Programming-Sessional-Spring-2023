package lab2.c;

import java.util.Scanner;

public class Lab2C {

    public static void main(String[] args) {
       Scanner sss=new Scanner(System.in);
       double a,b,c,d,m,n,x1,x2,r1,r2,r3;
       System.out.print("A = ");
       a=sss.nextDouble();
       System.out.print("B = ");
       b=sss.nextDouble();
       System.out.print("C = ");
       c=sss.nextDouble();
       System.out.print("D = ");
       d=sss.nextDouble();
       System.out.print("M = ");
       m=sss.nextDouble();
       System.out.print("N = ");
       n=sss.nextDouble();
       if(c*b==a*d)
       {System.out.println("Error 404");
       }
       else 
       {   r1=(m*d)-(b*n);
       r2=(a*d)-(c*d);
       r3=(n*a)-(m*c);
       x1=r1/r2;
       x2=r3/r2;
       System.out.println("X1= "+x1"X2= "+x2);
       }}
    
}
