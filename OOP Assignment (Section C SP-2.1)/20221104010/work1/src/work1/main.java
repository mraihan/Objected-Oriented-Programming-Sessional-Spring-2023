
package work1;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        
        Scanner input =new Scanner (System.in);
        
        double x,u,a,t,p1,p2;
        System.out.print("u= ");
        u=input.nextDouble();
        System.out.print("a= ");
        a=input.nextDouble();
        System.out.print("t= ");
        t=input.nextDouble();
        
        p1=u*t;
        p2=a*t*t;
        p2=p2/2;
        x=p1+p2;
        System.out.println("x= "+x);
    }
    
}
