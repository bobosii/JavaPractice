package FundementalConceptsAndVariables;
import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {
        // Taksimetre başlangıcı 10 tl, km başına ise 2.20 ücret alınıyor minimum tutar 20 tl.
        double pricePerKm,totalKm,totalPrice,firstPrice;
        firstPrice = 10;
        Scanner inp = new Scanner(System.in);

        pricePerKm = 2.20;
        System.out.print("Kaç km yol gideceksiniz ? ");
        totalKm = inp.nextDouble();
        totalPrice = totalKm * pricePerKm + firstPrice;
        totalPrice = (totalPrice<20) ? 20 : totalPrice;
        System.out.println("Toplam ödenecek tutar : " + totalPrice);
    }
}
