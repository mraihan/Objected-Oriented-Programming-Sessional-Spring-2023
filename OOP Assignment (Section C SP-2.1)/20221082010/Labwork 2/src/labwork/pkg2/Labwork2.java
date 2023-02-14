package labwork.pkg2;

import java.util.Scanner;

public class Labwork2 {

    
    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);
        double f,l,r,c,t1,t2;
        System.out.print("LC = ");
        l=sc.nextDouble();
        System.out.print("R = ");
        r=sc.nextDouble();
        System.out.print("C = ");
        c=sc.nextDouble();
        t1=l/l;
        t2=r/(4*c);
        t2=t2*t2;
        f=Math.sqrt(t1-t2);
      System.out.println("F = "+f);
    }
    
}
