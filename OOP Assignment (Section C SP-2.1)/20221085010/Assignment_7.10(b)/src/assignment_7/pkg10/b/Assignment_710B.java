
package assignment_7.pkg10.b;
import java.util.Scanner;

public class Assignment_710B {

    
    public static void main(String[] args) {
         Scanner M = new Scanner(System.in);
        
        System.out.print("Enter NUMBER : ");
        int n = M.nextInt();
        
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

    }
    
}
