
package pkg20221094010.number.pkg7.pkg10.c;

import java.util.Scanner;

public class Number710C {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>0;j--)
            {  
               System.out.print(" "); 
            }
            for(int x=1;x<=i;x++)
            {
                 System.out.print(i);
            }
             System.out.print("\n");
    
        }
    }
    
}
