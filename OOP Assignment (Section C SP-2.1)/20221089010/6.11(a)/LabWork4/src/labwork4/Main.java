package labwork4;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the size of Floyd's Triangle : ");       
        int n=scan.nextInt();
        
        int c=0;
        
        System.out.println("The Floyd's Triangle : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                c++;
                
                System.out.print(c+" ");
                
            }
            
            System.out.println();
        }
        
    }
    
}
