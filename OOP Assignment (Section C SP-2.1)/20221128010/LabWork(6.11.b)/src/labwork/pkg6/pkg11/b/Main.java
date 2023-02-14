
package labwork.pkg6.pkg11.b;


import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of Floyd's Triangle : ");
        int n=scan.nextInt();
        
        System.out.println("The Floyd's Triangle : ");
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                int t=i+j;                
                System.out.print(t%2+" ");
            }
            
            System.out.println();
        }
        
    }
    
}