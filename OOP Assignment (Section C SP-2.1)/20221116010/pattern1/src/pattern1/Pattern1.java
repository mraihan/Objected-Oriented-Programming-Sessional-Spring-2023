/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pattern1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Pattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print(i);
        		}
 
        		System.out.println(" ");
    }
    
}
}
