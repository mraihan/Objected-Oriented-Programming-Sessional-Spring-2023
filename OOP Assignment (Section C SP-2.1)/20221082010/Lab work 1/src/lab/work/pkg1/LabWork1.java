package lab.work.pkg1;

import java.util.Scanner;
public class LabWork1 {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        double d,u,a,t,t1,t2;
        System.out.print("u = ");
        u=sc.nextDouble();
        System.out.print("a = ");
        a=sc.nextDouble();
        System.out.print("t = ");
        t=sc.nextDouble();
        t1=u*t;
        t2=a*t*t;
        t2=t2/2;
        d=t1+t2;
        System.out.println("d = "+d);
    }
    
}
