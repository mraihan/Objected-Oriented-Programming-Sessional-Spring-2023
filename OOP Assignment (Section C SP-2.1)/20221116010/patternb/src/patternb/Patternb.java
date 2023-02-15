/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternb;

/**
 *
 * @author DELL
 */
public class Patternb {

    
    public static void main(String[] args) {
       int size = 5;
    for (int i = 0; i < size; i++) {
    
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
     
      for (int j = size; j > i; j--) {
        System.out.print("$");
      }
      System.out.println();
    }
    
}
 }
