package com.mycompany.assin5;

import java.util.*;
public class Assin5 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n,row,col,x;
       n = input.nextInt();
       for(row=0;row<=n;row++)
       {
           for(col=0;col<row;col++)
           {
               x=row+col;
               if(x%2!=0)
                System.out.print(" 1");
               else
                System.out.print(" 0");   
           
           }
           System.out.print("\n");
       }
    }
}
