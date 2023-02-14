
package labwork8;

import java.util.Scanner;

public class Labwork8 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       double u,v,w,x,t1,t2;
       System.out.print("u=");
       u=s.nextDouble();
       
       System.out.print("v=");
       v=s.nextDouble();
       
       System.out.print("w=");
       w=s.nextDouble();
       
       t1=1/u;
       t2=v/(4*w);
       t2=t2*t2;
       x=Math.sqrt(t1-t2);
       System.out.println(" x="+x);
    }
    
}
