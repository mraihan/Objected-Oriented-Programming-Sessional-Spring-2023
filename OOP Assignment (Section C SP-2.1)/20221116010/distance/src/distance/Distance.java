/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distance;



 import java.util.Scanner;
public class Distance {

    public static void main(String[] args) {
    
     Scanner in =new Scanner(System.in);
       System.out.println("Enter u: ");
       int u =in.nextInt();
       System.out.println("Enter a: ");
       int  a= in.nextInt();
       System.out.println("Enter t: ");
       int t=  in.nextInt();
       float d=(u*t)+(a*t*t)/2;
    
        System.out.println("the distance:"+d);
    }
    
    
}
