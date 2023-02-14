
package assignment_6.pkg7;

import java.util.Scanner;
public class Assignment_67 { 
    public static void main(String[] args) {
     Scanner W=new Scanner (System.in);
     float A,B,C,D,M,N,X_1,X_2,Temporary_1,Temporary_2,Temporary_3;
     System.out.println("A:");
     A=W.nextFloat();    
      System.out.println("B:");
     B=W.nextFloat();     
     System.out.println("C:");
     C=W.nextFloat();    
     System.out.println("D:");
     D=W.nextFloat();    
     System.out.println("M:");
     M=W.nextFloat(); 
     System.out.println("N:");
     N=W.nextFloat();    
     if(A*D==C*D)
     {
     System.out.println("INVALID");
    }
     else 
     {
     Temporary_1=(M*D)-(B*N);
     Temporary_2=(A*D)-(C*D);
     Temporary_3=(N*A)-(M*C);
     X_1 =(Temporary_1/Temporary_2);
     X_2=(Temporary_3/Temporary_2);
    System.out.println("X_1="+X_1);        
      System.out.println("X_2="+X_2);          
     }
}
}