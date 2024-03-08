package Loops;
import java.util.Scanner;
public class ExponentialNumberCalculation {
    public static void main(String[] args) {
        /*int n,k;
        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı");
        n = inp.nextInt();
        System.out.println("Üs olacak sayı");
        k = inp.nextInt();
        int i = 1,total = 1;
        while (i<=k){
            total *=n;
            i++;
        }
        System.out.println(total);

         */
        int n,k,total = 1;
        Scanner scn = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı : ");
        n = scn.nextInt();
        System.out.print("Üs olacak sayı : ");
        k = scn.nextInt();
        for (int i = 1; i<=k;i++){
            total *=n;
        }
        System.out.println(total);

    }
}
