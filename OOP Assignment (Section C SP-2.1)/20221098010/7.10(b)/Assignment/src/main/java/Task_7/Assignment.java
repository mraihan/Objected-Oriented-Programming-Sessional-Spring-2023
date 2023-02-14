
package Task_7;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of the inverted triangle: ");
        int size = input.nextInt();
        
        for (int row = size; row >= 1; row--) {
            for (int space = 1; space <= size - row; space++) {
                System.out.print("  ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        
    }
    
}

