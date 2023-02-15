/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternc;

/**
 *
 * @author DELL
 */
public class Patternc {

    
    public static void main(String[] args) {
        int size = 6;
   
    for (int i = 0; i < size; i++) {
     
      for (int j = 1; j < size - i; j++) {
        System.out.print(" ");
      }
      
      for (int k = 1; k <= i; k++) {
        System.out.print(i);
      }
      System.out.println();
    }
    
}
}
