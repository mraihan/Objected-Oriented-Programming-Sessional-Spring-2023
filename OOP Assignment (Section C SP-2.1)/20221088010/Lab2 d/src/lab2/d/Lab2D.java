
package lab2.d;

import java.util.Scanner;

public class Lab2D {

    public static void main(String[] args) {
   Scanner sss=new Scanner(System.in);
   int n,i,j,c=0;
   n=sss.nextInt();
   for(i=0;;i++)
   {for(j=0;j<=i;j++)
   {c++;
   System.out.print(c+"");
   if(c==n)
       break;
   }
   System.out.print("\n");
   if(c==n)
       break;
   }
    }
    
}
