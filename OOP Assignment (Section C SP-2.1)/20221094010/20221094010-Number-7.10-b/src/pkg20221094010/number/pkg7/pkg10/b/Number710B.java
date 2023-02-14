
package pkg20221094010.number.pkg7.pkg10.b;

import java.util.Scanner;

public class Number710B {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {  
               System.out.print(" "); 
            }
            for(int x=n;x>i;x--)
            {
                 System.out.print("$");
            }
             System.out.print("\n");
    
        }
    }
    
}
