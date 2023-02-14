package labwork8;

import java.util.Scanner;
public class Labwork8 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       
       for(i=1;i<=n;i++)
       {
           for(j=1;j<=n-i;j++)
           {
               System.out.print(" ");
           }
           for(j=1;j<=i;j++)
           {
               System.out.print(i+"");
           }
           System.out.print("\n");
       }
    }
    
}
