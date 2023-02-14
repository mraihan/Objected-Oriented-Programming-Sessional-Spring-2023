
package work6;

import java.util.Scanner;
public class Work6{
    public static void main(String[] args) {
       Scanner ppp= new Scanner(System.in);
       int p,i,j;
       p= ppp.nextInt();
       for(i=1;i<=p;i++){
           for(j=0;j<i;j++){
            System.out.print(i+" ");
           }
         System.out.print("\n");  
       }
    }
    
}
