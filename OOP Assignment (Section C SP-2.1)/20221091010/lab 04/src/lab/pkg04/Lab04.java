
package lab.pkg04;

import java.util.Scanner;


public class Lab04 {

    public static void main(String[] args) {
        int i,j,n,c=0;
        Scanner s = new Scanner(System.in);
        System.out.print("n=");
        n=s.nextInt();
       for(i=0;i<n;i++)
       {
           for(j=0;j<i;j++)
           {
               c++;
               System.out.print(c+" ");
               if(c==n)
                   break;
           }
           System.out.print("\n");
           if(c==n)
               break;
       }
       
        
        
         
    }
    
}
