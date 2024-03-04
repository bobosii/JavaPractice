package FundementalConceptsAndVariables;
import java.util.Scanner;
public class Grocery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5,total;

        System.out.print("Kaç kg armut aldınız ? ");
        double armutKg = input.nextDouble();
        System.out.print("Kaç kg elma aldınız ? ");
        double elmaKg = input.nextDouble();
        System.out.print("Kaç kg domates aldınız ? ");
        double domatesKg = input.nextDouble();
        System.out.print("Kaç kg muz aldınız ? ");
        double muzKg = input.nextDouble();
        System.out.print("Kaç kg patlican aldınız ? ");
        double patlicanKg = input.nextDouble();

        total = armut * armutKg + elma * elmaKg + domates * domatesKg + muz * muzKg + patlican * patlicanKg;
        System.out.println("Toplam fiyat = " + total);


    }
}
