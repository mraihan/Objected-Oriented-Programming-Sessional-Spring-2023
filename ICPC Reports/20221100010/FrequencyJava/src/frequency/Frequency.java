/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequency;

/**
 *
 * @author nahid
 */import java.util.Scanner;

public class Frequency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of L (inductance): ");
        double L = input.nextDouble();

        System.out.print("Enter the value of R (resistance): ");
        double R = input.nextDouble();

        for (double C = 0.01; C <= 0.1; C += 0.01) {
            double frequency = Math.sqrt(1 / (L * C)) - (R * R) / (4 * C * C);
            System.out.println("For C = " + C + ", the frequency is " + frequency);
        }
    }
}
