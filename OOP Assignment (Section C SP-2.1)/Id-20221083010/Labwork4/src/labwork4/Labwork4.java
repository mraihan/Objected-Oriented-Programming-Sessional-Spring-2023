
package labwork4;

import java.util.Scanner;
public class Labwork4 {

    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in); 
        int i,j,n,c=0;
        n=sss.nextInt();
          for(i=0;;i++){
          
            for(j=0;j<=i;j++)
            { 
                c++;
                System.out.print(c+" ");
                if(c==n)
                    break;
            }
            for(j=0;j<i;j++)
            
              System.out.print("\n");
            if(c==n)
                break;
                 
         }
    }
    
}
