package Loops;
import java.util.Scanner;
public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a;
        double result = 0;
        System.out.print("Enter a number : ");
        a = inp.nextInt();

        for (double i = 1; i<=a; i++){
            result += (1/i);
        }
        System.out.println(result);
    }
}
