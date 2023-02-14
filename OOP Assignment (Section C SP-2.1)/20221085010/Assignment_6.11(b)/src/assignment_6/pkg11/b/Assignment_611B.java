
package assignment_6.pkg11.b;
import java.util.Scanner;
public class Assignment_611B {
    public static void main(String[] args) {
        
        Scanner M = new Scanner(System.in);

        System.out.print("Enter the Number of Floyd's Triangle: ");
        int Number = M.nextInt();

        System.out.println("Floyd's Triangle with alternating 0's and 1's:");
        for (int i = 1; i <= Number; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        
    }
    
}
