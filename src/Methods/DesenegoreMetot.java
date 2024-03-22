package Methods;
import java.util.Scanner;
public class DesenegoreMetot {
    public static void recursive(int n)
    {
        System.out.println(n);

        if (n <= 0) {
            System.out.println(n);
            return;
        }

        recursive(n - 5);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        recursive(sayi);
    }
}
