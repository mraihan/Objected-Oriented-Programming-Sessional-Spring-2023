package oop.lab.mostfrequentdigit;
import java.util.Scanner;

public class MostFrequentDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        int[] count = new int[10];
        while (N > 0) {
            int digit = (int) (N % 10);
            count[digit]++;
            N /= 10;
        }
        int maxCount = 0, maxDigit = 9;
        for (int i = 0; i <= 9; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxDigit = i;
            }else if(count[i] == maxCount){
                maxDigit = Math.min(maxDigit,i);
            }
        }
        System.out.println(maxDigit);
        scan.close();
    }
}
