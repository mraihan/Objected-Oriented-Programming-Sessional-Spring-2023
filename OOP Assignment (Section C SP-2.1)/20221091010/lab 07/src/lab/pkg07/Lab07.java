
package lab.pkg07;

import java.util.Scanner;

public class Lab07 {

    public static void main(String[] args) {
        int i,j,n;
        Scanner s = new Scanner(System.in);
         System.out.print("n=");
        n=s.nextInt();
          for(i=0;i<n;i++)
          {
            for(j=0;j<i;j++)
             { 
                System.out.print(" ");
             }
            for(j=i;j<n;j++)
             {
                System.out.print("$"); 
            
             }
              System.out.print("\n");   
                 
         }
    }
    
}
