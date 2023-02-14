
package assignment_5.pkg10;
import java.util.Scanner;
public class Assignment_510 {

    public static void main(String[] args) {
      Scanner M=new Scanner (System.in);
      double Frequency,Inductance,Resistance,capacitance,Temporary_1,Temporary_2;
      System.out.println("LC:");
      Inductance=M.nextDouble();
      System.out.println("Resistance:");
      Resistance=M.nextDouble();
      System.out.println("capacitance:");
      capacitance=M.nextDouble();
      Temporary_1=(1/1);
      Temporary_2=(Resistance/(2*capacitance));
      Temporary_2=(Temporary_2*Temporary_2);
      Frequency = Math.sqrt((Temporary_1)-(Temporary_2));
      System.out.println("Frequency:" +Frequency);
    }
    
}
