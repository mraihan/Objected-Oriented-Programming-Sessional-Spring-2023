/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork.pkg5.pkg10;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        double f,lc,r,c,temp;
        
        System.out.print("Enter the value of LC = ");
        lc=scan.nextDouble();
        
        System.out.print("Enter the value of R= ");
        r=scan.nextDouble();
        
        System.out.print("Enter the value of C = ");
        c=scan.nextDouble();
        
        temp=r/(2*c);
        temp=temp*temp;
        f=Math.sqrt((1/lc)-temp);
        
        System.out.println("Frequency = "+f);
    }
    
}