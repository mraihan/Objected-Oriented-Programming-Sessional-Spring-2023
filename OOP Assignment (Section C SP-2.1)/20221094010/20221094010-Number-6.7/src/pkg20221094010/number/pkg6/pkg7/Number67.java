
package pkg20221094010.number.pkg6.pkg7;

import java.util.Scanner;

public class Number67 {

    public static void main(String[] args) {
        double a,b,c,d,m,n,x1,x2,i,j,k; 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        a = sc.nextDouble();
        System.out.print("Enter the value of b : ");
        b = sc.nextDouble();
        System.out.print("Enter the value of c : ");
        c = sc.nextDouble();
        System.out.print("Enter the value of d : ");
        d = sc.nextDouble();
        System.out.print("Enter the value of m : ");
        m = sc.nextDouble();
        System.out.print("Enter the value of n : ");
        n = sc.nextDouble();
        
        i=(m*d)-(b*n);
        j=(n*a)-(m*c);
        k=(a*d)-(c*d);
        
        x1=(i/k);
        x2=(j/k);
        
        if(((a*d)-(c*b))==0)
            System.out.print("0");
        else
        {
            System.out.println("x1 : "+x1);
            System.out.println("x2 :"+x2);
            
        
    }
    }
}
   
