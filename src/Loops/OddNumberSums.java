package Loops;
import java.util.Scanner;
public class OddNumberSums {
    public static void main(String[] args) {
        int k, sum = 0;
        Scanner scn = new Scanner(System.in);
       /* do {
            System.out.print("Enter a number : ");
            k = scn.nextInt();
            if (k%2 == 1){
                sum += k;
            }
        }while (k>0);
        System.out.println("Odd number sum is : " + sum);

        */
        do {
            System.out.print("Enter a number : ");
            k = scn.nextInt();
            if (k % 2 == 0 && k % 4 == 0){
                sum += k;
            }
        }while (k % 2 == 0);
        System.out.println("Result : " + sum);
    }
}
