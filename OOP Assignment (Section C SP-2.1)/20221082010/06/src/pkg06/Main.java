
package pkg06;

import java.util.*;
public class Main {

    
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int r,c,num;
     
    System.out.print("Enter the number = ");
     num=s.nextInt();
    for(r=1;r<=num;r++){
      for(c=1;c<=num-r;c++)
          System.out.print(" ");
      for(c=r;c>1;c--)
          System.out.print((char)(64+c));
      for(c=1;c<=r;c++)
          System.out.print((char)(64+c));
      System.out.println("");
    }
    
    }
    
}
