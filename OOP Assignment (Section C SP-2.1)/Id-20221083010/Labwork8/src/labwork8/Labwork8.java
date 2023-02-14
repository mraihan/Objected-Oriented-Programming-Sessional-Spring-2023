
package labwork8;
import java.util.Scanner;

public class Labwork8 {

   
    public static void main(String[] args) {
         
        Scanner sss = new Scanner(System.in); 
        int i,j,n;
        n=sss.nextInt();
          for(i=1;i<=n;i++){
          
            for(j=i;j<n;j++)
            { 
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
             {
                System.out.print(i+""); 
            
             }
              System.out.print("\n");   
                 
         }
    }
    
}


    
    

