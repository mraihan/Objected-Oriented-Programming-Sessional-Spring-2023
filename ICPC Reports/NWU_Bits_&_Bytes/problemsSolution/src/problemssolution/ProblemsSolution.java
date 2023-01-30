package problemssolution;
import java.util.Scanner;
/**
 *
 * @author Moloy
 */
public class ProblemsSolution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int N,M;
       N=input.nextInt();
       M=input.nextInt();
       boolean old=false;
       int[][] arr=new int[M][2]; //M line(row) and 2 value(coloumn) are line's two person
       for(int i=0;i<M;i++){
           for(int j=0;j<2;j++){
               arr[i][j]=input.nextInt();
           }
           for(int k=0;k<i;k++){
               if((arr[i][0]==arr[k][1] && arr[i][1]==arr[k][0])||(arr[i][0]==arr[k][0] && arr[i][1]==arr[k][1])){
                   old=true;
                   break;
               }
           }
           if(old) System.out.println("old");
           else System.out.println("new");
       }
    }
    
}
