package FundementalConceptsAndVariables;
import java.util.Scanner;
public class TaxiMeter {
    public static void main(String[] args) {

        
        double pricePerKm,totalKm,totalPrice,firstPrice;
        firstPrice = 10;
        Scanner inp = new Scanner(System.in);

        pricePerKm = 2.20;

        System.out.print("Kaç km yol gideceksiniz ? ");
        totalKm = inp.nextDouble();
        totalPrice = totalKm * pricePerKm + firstPrice;
        if (totalPrice<20){
            System.out.println("Toplam ödenecek ücretiniz : 20 TL");
        }else {
            System.out.println("Toplam ödenecek Ücretiniz : " + totalPrice);
        }



    }
}
