
package lab.pkg06;

import java.util.Scanner;

public class Lab06 {

    public static void main(String[] args) {
        int i,j,n;
        Scanner s = new Scanner(System.in);
        System.out.print("n=");
        n=s.nextInt();
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){ 
                 System.out.print(i+" ");
            }
             System.out.print("\n");    
        }
    }
    
}
