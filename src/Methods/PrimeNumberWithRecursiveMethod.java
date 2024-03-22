package Methods;
import java.util.Scanner;

public class PrimeNumberWithRecursiveMethod {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();

        if (isAsal(sayi))
            System.out.println(sayi + " bir asal sayıdır.");
        else
            System.out.println(sayi + " bir asal sayı değildir.");
    }

    public static boolean isAsal(int sayi) {
        if (sayi < 2)
            return false;
        else if (sayi == 2)
            return true;
        else if (sayi % 2 == 0)
            return false;
        else
            return isAsalHelper(sayi, 3);
    }

    private static boolean isAsalHelper(int sayi, int bolen) {
        if (bolen * bolen > sayi)
            return true;
        if (sayi % bolen == 0)
            return false;
        return isAsalHelper(sayi, bolen + 2);
    }
}
