
package com.mycompany.assin4;

import java.util.*;
public class Assin4 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,i,j,x=0;
       n = input.nextInt();
       for(i=0;i<=n;i++)
       {
           for(j=0;j<=i;j++)
           {
               x++;
               System.out.print(" "+x);
               if(x==n)
                   break;
           
           }
           System.out.print("\n");
           if(x==n)
               break;
       }
    }
}
