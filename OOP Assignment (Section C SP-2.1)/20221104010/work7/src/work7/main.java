
package work7;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int i,a,b;
        a=input.nextInt();
        for(i=0;i<a;i++){
            for(b=0;b<i;b++){
                System.out.print("  ");
            }
            for(b=i;b<a;b++){
                System.out.print("$ ");
            }
            System.out.print("\n");
        }
    }
}
