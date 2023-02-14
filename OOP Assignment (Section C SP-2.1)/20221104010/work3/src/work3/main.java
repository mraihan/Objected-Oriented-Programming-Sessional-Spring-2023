
package work3;

import java.util.Scanner;
public class main {
    public static void main(String []args){
        Scanner input =new Scanner(System.in);
        
        double a,b,c,d,m,n,x1,x2,z1,z2,z3;
        System.out.print("a= ");
        a=input.nextDouble();
        System.out.print("b= ");
        b=input.nextDouble();
        System.out.print("c= ");
        c=input.nextDouble();
        System.out.print("d= ");
        d=input.nextDouble();
        System.out.print("m= ");
        m=input.nextDouble();
        System.out.print("n= ");
        n=input.nextDouble();
       
        if(a*d==c*d)
        {
            System.out.println("Error");
        }
        else
        {
            z1=(m*d)-(b*n);
            z2=(a*d)-(c*d);
            z3=(n*a)-(m*c);
            
            x1=z1/z2;
            x2=z3/z2;
            System.out.println("X1= "+x1+"  X2= "+x2);
        }
    }
    
}
