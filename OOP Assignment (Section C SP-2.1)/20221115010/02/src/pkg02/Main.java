
package pkg02;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        int n, count = 0, temp;
        Scanner scanner;
        scanner = new Scanner(System.in);
 
        System.out.print("Enter an Integer: ");
        n = scanner.nextInt();
            temp = n;
 
        if (temp < 0)
            temp = temp * -1;
 
        if (temp != 0) {
           
            count = (int) Math.log10(temp) + 1;
        } else {
            count = 1;
        }
 
        System.out.format("Number of Digits is= %d", count);
    }
}
    
