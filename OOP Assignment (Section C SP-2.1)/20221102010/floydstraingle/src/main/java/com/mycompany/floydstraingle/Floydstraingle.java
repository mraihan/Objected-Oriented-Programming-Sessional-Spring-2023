
package com.mycompany.floydstraingle;

import java.util.Scanner;


public class Floydstraingle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Triangle pattern
        System.out.println("Triangle Pattern:");
        for (int i = 1; i <= numRows; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        // Alternating 0 and 1 pattern
        System.out.println("Alternating 0 and 1 Pattern:");
        for (int i = 1; i <= numRows; i++) {
            int num = i % 2 == 0 ? 0 : 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = num == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}

    





 
