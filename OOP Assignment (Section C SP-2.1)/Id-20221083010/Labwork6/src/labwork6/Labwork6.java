package labwork6;

import java.util.Scanner;
public class Labwork6 {

    
    public static void main(String[] args) {
       
        Scanner sss=new Scanner(System.in);
        int i,j,n;
        n=sss.nextInt();
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){ 
                 System.out.print(i+" ");
            }
             System.out.print("\n");    
        }
    }
    
}
