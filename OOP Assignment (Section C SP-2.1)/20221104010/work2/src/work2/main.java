
package work2;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        
        Scanner input=new Scanner(System.in);
        double f,l,r,c,x1,x2;
        System.out.print("LC= ");
        l=input.nextDouble();
        
        System.out.print("R= ");
        r=input.nextDouble(); 
        System.out.print("C= ");
        c=input.nextDouble(); 
        x1=1/l;
        x2=r/(2*c);
        x2=x2*x2;
        f=Math.sqrt(x1-x2);
        System.out.println("F= "+f);
    }
    
}
