
package work8;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int i,a,b;
        a=input.nextInt();
        for(i=1;i<=a;i++){
            for(b=i;b<a;b++){
                System.out.print("  ");
            }
            for(b=0;b<i;b++){
                System.out.print(i+" ");
                        
            }
            System.out.print("\n");
        }
    }
}
