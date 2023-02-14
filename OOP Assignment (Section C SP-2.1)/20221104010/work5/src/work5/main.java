
package work5;

import java.util.Scanner;
public class main {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int a,i,b,c;
        a=input.nextInt();
        for(i=1;i<=a;i++){
            for(b=0;b<i;b++){
                c=i+b;
                if(c%2!=0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }
}
