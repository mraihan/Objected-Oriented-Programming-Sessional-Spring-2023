
package work3;
import java.util.Scanner;

public class Work3 {
    public static void main(String[] args) {
        Scanner ppp = new Scanner(System.in);
    double a,b,c,d,m,n,x1,x2,r1,r2,r3;
      System.out.print("a = ");
       a= ppp.nextDouble();
       System.out.print("b = ");
       b= ppp.nextDouble();
       System.out.print("c = ");
       c= ppp.nextDouble();
       System.out.print("d = ");
       d= ppp.nextDouble();
       System.out.print("m = ");
       m= ppp.nextDouble();
       System.out.print("n = ");
       n= ppp.nextDouble();
      if(a*d==b*c){
          
       System.out.println("math error");
      }
      else{
       r1=(m*d) -(b*n) ;
       r2=(a*d)-(c*d);
       r3=(n*a)-(m*c);
       x1=r1/r2;
       x2=r3/r2;
       System.out.println("x1 = "+x1 + "x2 = "+x2);
      }
              
    }
    
}
