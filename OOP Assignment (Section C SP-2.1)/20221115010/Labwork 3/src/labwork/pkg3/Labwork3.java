package labwork.pkg3;
import java.util.Scanner;
public class Labwork3 {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     double a,b,c,d,m,n,x1,x2,t1,t2,t3;
     System.out.print("a = ");
     a=sc.nextDouble();
     System.out.print("b = ");
     b=sc.nextDouble();
     System.out.print("c = ");
     c=sc.nextDouble();
     System.out.print("d = ");
     d=sc.nextDouble();
     System.out.print("m = ");
     m=sc.nextDouble();
     System.out.print("n = ");
     n=sc.nextDouble();
     if(a*d==c*d)
     {
         System.out.println("Error");
     }
     else
     {
         t1=(m*d)-(b*n);
         t2=(a*d)-(c*d);
         t3=(n*a)-(m*c);
         x1=t1/t2;
         x2=t3/t2;
         System.out.println("X1 = "+x1+" X2 = "+x2);
     }
    }
    
}
