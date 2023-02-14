package com.mycompany.frequency;
import java.util.Scanner;
import java.lang.Math;
public class Frequency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double f,Lc,C,R,x1,x2,x3;
        System.out.print ("LC = "); 
        Lc=input.nextDouble();
        System.out.print ("R = ");
        R=input.nextDouble();
        System.out.print ("C = ");
        C=input.nextDouble();
        x1=1/Lc;
        x2=(R/(2*C));
        x3=x2*x2;
        f=Math.sqrt(x1-x3);
        System.out.println("Frequency = "+f);
    }
}
