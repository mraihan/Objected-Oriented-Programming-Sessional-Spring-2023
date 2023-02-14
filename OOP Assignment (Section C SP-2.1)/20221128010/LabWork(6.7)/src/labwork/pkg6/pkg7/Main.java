package labwork.pkg6.pkg7;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double a,b,c,d,m,n,x1,x2,temp;
        
        System.out.print("Enter the value of a = ");
        a=scan.nextDouble();
        
        System.out.print("Enter the value of b = ");
        b=scan.nextDouble();
        
        System.out.print("Enter the value of c = ");
        c=scan.nextDouble();
        
        System.out.print("Enter the value of d = ");
        d=scan.nextDouble();
        
        System.out.print("Enter the value of m = ");
        m=scan.nextDouble();
        
        System.out.print("Enter the value of n = ");
        n=scan.nextDouble();
        
        temp=(a*d)-(c*d);
        
        if(temp==0)
        {
            System.out.println("Invalid Value!");
        }
        
        else
        {
            x1=((m*d)-(b*n))/temp;
            x2=((n*a)-(m*c))/temp;
            
            System.out.println("X1 = "+x1);
            System.out.println("X2 = "+x2);
        }
        
    }
}