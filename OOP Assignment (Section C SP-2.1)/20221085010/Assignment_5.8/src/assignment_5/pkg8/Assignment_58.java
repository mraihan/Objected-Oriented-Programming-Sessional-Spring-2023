
package assignment_5.pkg8;
import java.util.Scanner;
public class Assignment_58 {

    public static void main(String[] args) {
     
        Scanner M=new Scanner (System.in);
        float Distance,p,q,t,temporary_1,temporary_2;
        System.out.println("p:");
        p=M.nextFloat();
        System.out.println("q:");
        q=M.nextFloat(); 
        System.out.println("t:");
        t=M.nextFloat();
        temporary_1=p*t;
        temporary_2=q*t*t;
        temporary_2=temporary_2/2;
        Distance=(temporary_1 + temporary_2);
        System.out.println("Distance:"+Distance);

    }
    
}
