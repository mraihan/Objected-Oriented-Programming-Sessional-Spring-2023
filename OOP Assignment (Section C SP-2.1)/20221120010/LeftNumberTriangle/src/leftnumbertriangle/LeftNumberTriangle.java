/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leftnumbertriangle;

/**
 *
 * @author nahid
 */
public class LeftNumberTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rows = 5;
for (int i = 1; i <= rows; i++) {
for (int j = 1; j <= rows - i; j++) {
System.out.print("  ");
}
for (int k = 1; k <= i; k++) {
System.out.print(i + " ");
}
System.out.println();
}
}
}
