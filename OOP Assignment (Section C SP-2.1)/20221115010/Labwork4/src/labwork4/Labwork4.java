package labwork4;

import java.util.Scanner;
public class Labwork4 {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,i,j,c=0;
        n=sc.nextInt();
        for(i=0;;i++)
        {
            for(j=0;j<=i;j++)
            {
                c++;
                System.out.print(c+" ");
                if(c==n)
                    break;
            }
            System.out.print("\n");
            if(c==n)
                break;
        }   
    }
    
}
