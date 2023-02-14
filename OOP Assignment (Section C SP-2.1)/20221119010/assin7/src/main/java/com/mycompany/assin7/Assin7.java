
package com.mycompany.assin7;

import java.util.Scanner;

public class Assin7 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,row,col;
       n = input.nextInt();
       for(row=0;row<n;row++)
       {
           for(col=0;col<row;col++)
           {
  
                System.out.print("  ");
           }
           for(col=row;col<n;col++)
           {
  
                System.out.print("$ ");
           }
           
           System.out.print("\n");
       }
    }
}
