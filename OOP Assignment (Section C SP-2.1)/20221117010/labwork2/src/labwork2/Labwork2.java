
package labwork2;
import java.util.Scanner;
public class Labwork2 {

    public static void main(String[] args) {
        
        int n, count, x, y;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number :");
      n = in.nextInt();
      System.out.println("Floyd's triangle :");
      for ( x = 1 ; x <= n ; x++ )
      {
         for ( y = 0 ; y < x ; y++ )
           {
               count=x+y;
              System.out.print(count%2+" ");
           }
          System.out.println();
      }
    }
    
}
