
package lab.pkg05;

import java.util.Scanner;

public class Lab05 {

    public static void main(String[] args) {
        int a,i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("n=");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                a=i+j;
                if(a%2!=0)
                  System.out.print("1");
                else
                  System.out.print("0");
                
            
            }
        System.out.print("\n");
        }
       
    }
    
}
