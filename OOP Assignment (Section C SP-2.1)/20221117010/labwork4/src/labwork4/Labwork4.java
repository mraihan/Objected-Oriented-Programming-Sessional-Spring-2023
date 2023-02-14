
package labwork4;
import java.util.Scanner;

public class Labwork4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
    int x,y,z;
    x = s.nextInt();
    for (y=0; y<x; y++)
    {
    for (z=0; z<=y;z++)
    {
    System.out.print("  ");
    }
    for (z=y;z<x;z++)
    {
    System.out.print("$ ");
    }
    System.out.println("\n");

    }
    }
    
}

