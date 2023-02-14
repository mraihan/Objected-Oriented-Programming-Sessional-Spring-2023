
package com.mycompany.abcpattern;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        // Pattern (a)
        System.out.println("Pattern (a):");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Pattern (b)
        System.out.println("Pattern (b):");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= numRows - i + 1; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }

        // Pattern (c)
        System.out.println("Pattern (c):");
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= numRows - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
