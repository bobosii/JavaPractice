package FundementalConceptsAndVariables;
import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        double boy,kilo,index;
        Scanner input = new Scanner(System.in);
        System.out.print("Metre cinsinden boyunuzu giriniz : ");
        boy = input.nextDouble();
        System.out.print("Kg cinsinden kilonuzu giriniz : ");
        kilo = input.nextDouble();

        index = kilo / (boy * boy) ;
        System.out.println("Vücut kitle indexiniz : " + index);
    }
}
