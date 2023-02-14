
package labwork7;

import java.util.Scanner;
public class Labwork7 {

    
    public static void main(String[] args) {
       Scanner sss=new Scanner(System.in);
        int i,j,n;
        n=sss.nextInt();
        for(i=0;i<=n;i++){
            for(j=0;j<i;j++){ 
                 System.out.print(" ");
                 }
            for(j=i;j<n;j++){
               System.out.print("$ "); 
            
            }
              System.out.print("\n ");   
                 
            }
    }
    
}
