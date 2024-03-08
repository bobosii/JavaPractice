package Loops;
import java.util.Scanner;
public class PowerOf2 {

    public static void main(String[] args) {
        /*int k;
        Scanner scn = new Scanner(System.in);
        k = scn.nextInt();
        for (int i = 1; i<=k ; i *= 2){
            System.out.println(i);

        }

         */
        int k;
        Scanner scn = new Scanner(System.in);
        k = scn.nextInt();
        for (int i = 1; i<=k ; i*=4){
            System.out.println("Power of 4 : " + i);
        }
        for (int i = 1; i<=k; i*=5){
            System.out.println("Power of 5 : " + i);
        }
    }
}
