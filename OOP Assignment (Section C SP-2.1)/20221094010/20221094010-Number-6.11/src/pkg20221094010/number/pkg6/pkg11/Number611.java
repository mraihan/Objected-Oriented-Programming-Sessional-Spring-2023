
package pkg20221094010.number.pkg6.pkg11;

import java.util.Scanner;

public class Number611 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
               System.out.print(count+" ");
               count++;
        
            }
            System.out.print("\n");
    
        }
    }
}