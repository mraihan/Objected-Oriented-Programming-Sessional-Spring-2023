
package labwork3;
import java.util.Scanner;
public class Labwork3 {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       double u,v,w,x,y,z,a1,a2,b1,b2,b3;
       System.out.print("u=");
       u=s.nextDouble();
       
       System.out.print("v=");
       v=s.nextDouble();
       
       System.out.print("w=");
       w=s.nextDouble();
       
       System.out.print("x=");
       x=s.nextDouble();
       
       System.out.print("y=");
       y=s.nextDouble();
       
       System.out.print("z=");
       z=s.nextDouble();
       
       if(u*v==w*x)
       {
       System.out.println("Error");
       }
       
       else
       {
       b1=(y*x)-(z*v);
       b2=(u*x)-(w*x);
       b3=(z*u)-(y*w);
       a1=b1/b2;
       a2=b3/b2;
       System.out.println("X1="+a1+" X2="+a2);
       }
     
    }
    
}
