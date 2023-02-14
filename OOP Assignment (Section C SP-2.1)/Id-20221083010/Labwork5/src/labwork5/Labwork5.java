
package labwork5;

import java.util.Scanner;
public class Labwork5 {

    
    public static void main(String[] args) {
        
        Scanner sss=new Scanner(System.in);
        int i,j,n,l;
        n=sss.nextInt();
        for(i=1;i<=n;i++){
            for(j=0;j<i;j++){
                l=i+j;
                if(l%2!=0)
                    
                System.out.print("1");
                else
                System.out.print("0");
                
            
            }
        System.out.print("\n");
        }
    }
    
}
