package Task_6;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = input.nextInt();
        
        for (int row = 1; row <= size; row++) {
            System.out.print(row);
            for (int col = 1; col < row; col++) {
                System.out.print(" " + row);
            }
            System.out.println();
        }
    }
}


