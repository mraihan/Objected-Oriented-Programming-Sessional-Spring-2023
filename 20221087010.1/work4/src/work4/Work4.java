
package work4;
import java.util.Scanner;
public class Work4 {
    public static void main(String[] args) {
        Scanner ppp = new Scanner (System.in);
        int p,i,j,q=0;
        p= ppp.nextInt();
        for ( i=0;;i++){
            for(j=0;j<=i;j++){
            q++;
            System.out.print(q+" ");
            if( q==p)
                break;
            
            }
           System.out.print(" \n"); 
           if(q==p)
               break;
        }
            
        
    }
    
}
