package FundementalConceptsAndVariables;
import java.util.Scanner;
public class KdvCalculator {
    public static void main(String[] args) {
        // Kdv li ve kdv siz fiyatı yazdırıcaz.
        Scanner inp = new Scanner(System.in);
        double price,kdv = 0.18,priceWithKdv,totalPrice;
        System.out.print("Ürün tutarını giriniz : ");
        price = inp.nextDouble();


        if (price<1000){
            priceWithKdv = price * kdv;
            totalPrice = priceWithKdv + price;
            System.out.println("Ürün tutarı : " + price);
            System.out.println("Kdv Tutarı : " + priceWithKdv);
            System.out.println("Toplam fiyat : " + totalPrice);
        }
        else {
            kdv = 0.08;
            priceWithKdv = price * kdv;
            totalPrice = priceWithKdv + price;
            System.out.println("Ürün tutarı : " + price);
            System.out.println("Kdv Tutarı : " + priceWithKdv);
            System.out.println("Toplam fiyat : " + totalPrice);

        }

    }
}
