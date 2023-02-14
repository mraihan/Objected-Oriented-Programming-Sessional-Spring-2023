package labwork5;

import java.util.Scanner;
public class Labwork5 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);  
      int n,i,j,c;
      n=sc.nextInt();
      for(i=0;i<=n;i++)
      {
          for(j=0;j<i;j++)
          {
              c=i+j;
              if(c%2!=0)
                  System.out.print("1 ");
              else
                  System.out.print("0 ");
          }
          System.out.print("\n");
      }
    }
    
}
