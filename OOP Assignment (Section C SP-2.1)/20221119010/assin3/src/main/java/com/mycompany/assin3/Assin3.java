
package com.mycompany.assin3;
import java.util.*;
public class Assin3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,d,m,n,x1,x2;
        System.out.print("Enter the value A = ");
        a = input.nextDouble();
        System.out.print("Enter the value B = ");
        b = input.nextDouble();
        System.out.print("Enter the value C = ");
        c = input.nextDouble();
        System.out.print("Enter the value D = ");
        d = input.nextDouble();
        System.out.print("Enter the value M = ");
        m = input.nextDouble();
        System.out.print("Enter the value N = ");
        n = input.nextDouble();
        if(a*d==c*b)
        {
            System.out.print("Error");
        }
        else
        {
            x1=((m*d)-(b*n))/((a*d)-(c*d));
            x2=((n*a)-(m*c))/((a*d)-(c*d));
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
