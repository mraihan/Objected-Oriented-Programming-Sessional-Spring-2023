
package oop.lab.floydstriangle;

/**
 *
 * @author Swapnil Das Saikat
 * ID: 20221101010
 */
import java.util.Scanner;

public class FloydsTriangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of rows for Pattern (a): ");
        int rows = scan.nextInt();
        
        System.out.println();
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        
        System.out.print("Enter number of rows for Pattern (b): ");
        rows = scan.nextInt();
        System.out.println();
        num = 1;
        for (int i = 1; i <= rows; i++) {
            num = (i%2 == 0) ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = (num == 0) ? 1 : 0;
            }
            System.out.println();
        }
        scan.close();
    }
}
