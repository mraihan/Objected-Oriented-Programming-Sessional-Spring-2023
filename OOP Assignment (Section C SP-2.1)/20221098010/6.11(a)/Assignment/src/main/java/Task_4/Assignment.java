
package Task_4;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of Floyd's Triangle : ");       
        int n = scan.nextInt();
        
        int P = 1;
        
        System.out.println("The Floyd's Triangle : ");
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(P + " ");
                P++;
            }
            System.out.println();
        }
    }
    
}

