package Task_1;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter initial velocity (u): ");
    double u = scan.nextDouble();

    System.out.print("Enter acceleration (a): ");
    double a = scan.nextDouble();

    System.out.print("Enter time (t): ");
    double t = scan.nextDouble();

    double d = u * t + 0.5 * a * t * t;

    System.out.println("Distance: " + d);
  }
}

