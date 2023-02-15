/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package freequency;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Freequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       System.out.println("Enter L: ");
       int  l =in.nextInt();
       System.out.println("Enter C: ");
        float  c= in.nextFloat();
       System.out.println("Enter R: ");
       int r=  in.nextInt();
       
       double f=Math.sqrt((1/l*c)-(r*r/4*c*c));
    
        System.out.println("Frequency:"+f);
    }
    
}
