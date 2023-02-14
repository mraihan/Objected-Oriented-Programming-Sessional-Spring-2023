
package com.mycompany.assin6;

import java.util.Scanner;


public class Assin6 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       int n,row,col;
       n = input.nextInt();
       for(row=0;row<=n;row++)
       {
           for(col=0;col<row;col++)
           {
  
                System.out.print(" "+row);   
           
           }
           System.out.print("\n");
       }
    }
}

