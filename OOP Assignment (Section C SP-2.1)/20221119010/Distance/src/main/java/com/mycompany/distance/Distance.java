
package com.mycompany.distance;
import java.util.*;

public class Distance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,u,t,d;
        System.out.print("enter the value U :");
        u = input.nextInt();
        System.out.print("enter the value A :");
        a = input.nextInt();
        System.out.print("enter the value T :");
        t = input.nextInt();
        d=u*t+(a*t*t)/2;
       
        
        System.out.print("The total distance "+d);
    }
}
