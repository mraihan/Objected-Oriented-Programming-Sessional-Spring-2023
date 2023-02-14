
package assignment_7.pkg10.c;

import java.util.Scanner;
public class Assignment_710C {

    public static void main(String[] args) {
          
       Scanner M = new Scanner(System.in);
        
        System.out.print("Enter the NUMBER : ");
        int n = M.nextInt();
        
        for (int i = 1; i <=n; i++) {
            for (int j =i; j < n; j++) {
                System.out.print("  ");
            }
            
            for (int j = 0; j < i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
  
        
    }
    
}
