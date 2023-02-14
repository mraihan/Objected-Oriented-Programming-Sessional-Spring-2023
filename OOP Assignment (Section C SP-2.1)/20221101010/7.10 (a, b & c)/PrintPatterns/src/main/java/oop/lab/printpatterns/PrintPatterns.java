
package oop.lab.printpatterns;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
import java.util.Scanner;

public class PrintPatterns {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);


        System.out.print("Enter number of rows for Pattern (a): ");
        int n = scan.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.print("Enter number of rows for Pattern (b): ");
        n = scan.nextInt();
        System.out.println();
        int k = 0;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= k; j++) {
                System.out.print("  ");
            }
            k++;
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        System.out.println();


        System.out.print("Enter number of rows for Pattern (c): ");
        n = scan.nextInt();
        System.out.println();
        k = n - 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                System.out.print("  ");
            }
            k--;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
            }
            num++;
            System.out.println();
        }
        
        scan.close();
    }
}
