
package work1;
import java.util.Scanner;

public class Work1 {

    public static void main(String[] args) {
        Scanner ppp = new Scanner (System.in);
        double n,u,a,t,m1,m2;
        System.out.print("u=");
        u=ppp.nextDouble();
        System.out.print("a=");
        a=ppp.nextDouble();
        System.out.print("t=");
        t=ppp.nextDouble();
        m1=u*t;
        m2=a*t*t;
        m2=m2/2;
        n=m1+m2;
        System .out.println("distance ="+n);
        
    }
    
}
