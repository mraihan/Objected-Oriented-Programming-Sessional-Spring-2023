package com.mycompany.modifiedfloydtriangle;


public class ModifiedFloydTriangle {

    public static void main(String[] args) {
         int rows = 5, number = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = (number == 0) ? 1 : 0;
            }
            System.out.println();
        }
        
    }
}