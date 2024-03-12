package Loops;
import java.util.Scanner;
public class HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int elemanSayisi = scanner.nextInt();

        System.out.println("Fibonacci serisi:");
        fibonacciSerisiYazdir(elemanSayisi);
    }

    private static void fibonacciSerisiYazdir(int n) {
        int ilkSayi = 0, ikinciSayi = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(ilkSayi + " ");

            int gecici = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = gecici;
        }
    }

}
