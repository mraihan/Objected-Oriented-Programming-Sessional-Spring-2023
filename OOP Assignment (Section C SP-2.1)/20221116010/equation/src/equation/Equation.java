/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package equation;

import java.util.Scanner;

public class Equation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner in =new Scanner(System.in);
       System.out.println("Enter a: ");
       int a= in.nextInt();
       System.out.println("Enter b: ");
       int  b= in.nextInt();
       System.out.println("Enter m: ");
       int m=  in.nextInt();
       
       System.out.println("Enter c: ");
       int c= in.nextInt();
       System.out.println("Enter d: ");
       int d = in.nextInt();
       System.out.println("Enter n: ");
       int n = in.nextInt();
       
       if ((a*d)-(c*d)==0){
        
       System.out.println( "Error"); 
       }
       
       else{
      
       float x1=((m*d)-(b*n))/((a*d)-(c*d));
       float x2=((n*a)-(m*c))/((a*d)-(c*d));
    
    
        System.out.println("X1:"+x1);
        System.out.println("X2"+x2);
    }
    } 
}
