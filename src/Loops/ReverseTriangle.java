package Loops;
import java.util.Scanner;
public class ReverseTriangle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int vNum = inp.nextInt();

        for (int i = vNum / 2 - 1; i >= 0; i--) {
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
