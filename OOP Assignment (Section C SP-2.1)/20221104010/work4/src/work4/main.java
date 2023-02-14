
package work4;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        int a,i,b,c=0;
        a=input.nextInt();
        for(i=0;;i++)
        {
            for(b=0;b<=i;b++)
            {
                c++;
                System.out.print(c+" ");
                if(c==a)
                    break;
            }
            System.out.println("\n");
            if(c==a)
                break;
        }
    }
    
}
