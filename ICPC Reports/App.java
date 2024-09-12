import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int number=1,count=0,i;  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Nth value:");
        int n= sc.nextInt();
        while(count<n)
        {
            number++;
            for(i=2;i<=number;i++)
            {
                if(number%i==0)
                {
                    break;
                }
            }
            if(i==number)
            {
                count++;
            }
        }
        System.out.print("The "+n+"th prime number is:"+number);
    }
}
