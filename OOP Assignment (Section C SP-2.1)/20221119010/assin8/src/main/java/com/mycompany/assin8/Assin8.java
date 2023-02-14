

package com.mycompany.assin8;

import java.util.Scanner;

public class Assin8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int n,row,col;
       n = input.nextInt();
       for(row=1;row<=n;row++)
       {
           for(col=row;col<n;col++)
           {
                System.out.print("  ");
           }
           for(col=0;col<row;col++)
           {
  
                System.out.print(" "+row);
           }
           
           System.out.print("\n");
        }
    }
}