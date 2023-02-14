package labwork6;
import java.util.Scanner;
public class Labwork6 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n,i,j;
       n=sc.nextInt();
       for(i=1;i<=n;i++)
       {
           for(j=0;j<i;j++)
           {
               System.out.print(i+" ");
           }
           System.out.print("\n");
       }
    }
    
}
