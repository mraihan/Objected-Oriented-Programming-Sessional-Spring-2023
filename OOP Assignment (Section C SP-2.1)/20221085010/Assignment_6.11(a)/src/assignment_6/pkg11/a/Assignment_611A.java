
package assignment_6.pkg11.a;

import java.util.Scanner;
public class Assignment_611A {
    public static void main(String[] args) {
        
        Scanner M = new Scanner(System.in);
        System.out.print("Enter the Number of Floyd's Triangle: ");
        int Number = M.nextInt();
        int count = 0;
        System.out.println("Floyd's Triangle:");
        for (int i = 1; i <= Number; i++) {
            for (int j = 1; j <= i; j++) {
                count++;
                System.out.print(count + " ");
            }
            System.out.println();
        }

    }
    
}
