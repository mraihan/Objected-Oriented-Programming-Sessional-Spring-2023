package labwork7;

import java.util.Scanner;
public class Labwork7{
    public static void main(String[] args) {
       Scanner ppp= new Scanner(System.in);
       int p,i,j;
       p= ppp.nextInt();
       for(i=0;i<p;i++){
           for(j=0;j<i;j++){
            System.out.print("  ");
           }
           for(j=i;j<p;j++){
            System.out.print("$ ");   
           }
         System.out.print("\n");  
       }
    }
    
}


