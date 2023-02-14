
package labwork7;

import java.util.Scanner;

public class Labwork7 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       double u,v,w,x,t1,t2;
       System.out.print("u=");
       u=s.nextDouble();
       
       System.out.print("v=");
       v=s.nextDouble();
       
       System.out.print("w=");
       w=s.nextDouble();
   
       t1=u*w;
       t2=v*w*w;
       t2=t2/2;
       x=t1+t2;
       System.out.println(" x="+x);
       }
    }
    
