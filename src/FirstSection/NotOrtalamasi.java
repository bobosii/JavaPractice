package FirstSection;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        //Fizik, Kimya, Müzik, Türkçe, Tarih, Matematik
        Scanner input = new Scanner(System.in);
        int vMat,vFizik,vChem,vMusic,vTurk,vHistory;

        System.out.print("Matematik notunuzu giriniz : ");
        vMat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        vFizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz : ");
        vChem = input.nextInt();
        System.out.print("Müzik notunuzu giriniz : ");
        vMusic = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz : ");
        vTurk = input.nextInt();
        System.out.print("Tarih notunuzu giriniz : ");
        vHistory = input.nextInt();
        int sumNote = vMat + vFizik + vChem + vMusic + vHistory + vTurk;
        double result =  sumNote / 6.0;
        String success = (result>60) ? "Sinifi geçti" : "Sinifta kaldi";

        System.out.println("Not ortalaması = " + result +" "+ success);
        //Emirhan DAY

    }
}
