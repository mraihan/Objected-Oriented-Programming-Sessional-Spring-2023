
package labwork6;

import java.util.Scanner;

public class Labwork6 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();         
        for (int y = 1; y <= x; y++) 
        {
            for (int z = y; z < x; z++)
            {
                System.out.print("  ");
            }
            for (int z = 1; z <= y; z++)
            {
                System.out.print(y+" ");
            }
               
            System.out.println();
        }         
    }
    
}
