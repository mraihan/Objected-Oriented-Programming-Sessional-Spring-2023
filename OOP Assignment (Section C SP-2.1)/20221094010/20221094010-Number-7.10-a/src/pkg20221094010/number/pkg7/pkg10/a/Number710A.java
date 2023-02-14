
package pkg20221094010.number.pkg7.pkg10.a;

import java.util.Scanner;

public class Number710A {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                
               System.out.print(i+" ");
              
            }
            System.out.print("\n");
    
        }
    }
    
}
