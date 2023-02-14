
package Task_8;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the triangle: ");
        int H = input.nextInt();
        
        for(int i = 1; i <= H; i++, System.out.println()) {
            for(int j = i; j < H; j++) System.out.print("  ");
            for(int j = 0; j < i; j++) System.out.print(i + " ");
        }
    }
    
}

