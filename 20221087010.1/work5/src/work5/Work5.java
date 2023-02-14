
package work5;
import java.util.Scanner;

public class Work5 {


    public static void main(String[] args) {
        Scanner ppp= new Scanner(System.in);
        int p,q,i,j;
        p=ppp.nextInt();
        for(i=1;i<=p;i++){
          for(j=0;j<i;j++){
              q=i+j;
              if(q%2!=0)
                  System.out.print("1 ");
              else
                  
                    System.out.print("0 ");   
                  }
               System.out.print("\n");
        }
     
      
    }
    
}
