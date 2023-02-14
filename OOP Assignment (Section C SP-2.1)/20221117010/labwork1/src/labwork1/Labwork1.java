
package labwork1;
import java.util.Scanner;

public class Labwork1 {

    public static void main(String[] args) {
 int n, count = 1, x, y;
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the number :");
      n = in.nextInt();
      System.out.println("Floyd's triangle :");
      for ( x = 1 ; x <= n ; x++ )
      {
         for ( y = 1 ; y <= x ; y++ )
           {
              System.out.print(count+" ");
              count++;
           }
          System.out.println();
      }
    }
    
}
