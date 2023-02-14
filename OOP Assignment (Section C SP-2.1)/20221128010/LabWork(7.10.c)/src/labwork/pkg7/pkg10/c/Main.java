
package labwork.pkg7.pkg10.c;



import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Size : ");
        int n=scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("  ");
            }
            
            for(int j=0;j<i;j++)
            {
                System.out.print(i+" ");
            }
            
            System.out.println();
        }
        
    }
    
}