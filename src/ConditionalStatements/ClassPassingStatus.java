package ConditionalStatements;
import java.util.Scanner;
public class ClassPassingStatus {
    public static void main(String[] args) {
        int math,phys,turkish,chem,music,dontGet = 0;
        double result;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz : ");
        math = inp.nextInt();
        if (math>100){
            System.out.println("Girilen not 0-100 aralığında olmalıdır. Bu sebeple bu ders hesaplanmayacaktır");
            dontGet++;
            math = 0;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        phys = inp.nextInt();
        if (phys>100){
            System.out.println("Girilen not 0-100 aralığında olmalıdır. Bu sebeple bu ders hesaplanmayacaktır");
            dontGet++;
            phys = 0;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkish = inp.nextInt();
        if (turkish>100){
            System.out.println("Girilen not 0-100 aralığında olmalıdır. Bu sebeple bu ders hesaplanmayacaktır");
            dontGet++;
            turkish = 0;
        }

        System.out.print("Kimya notunuzu giriniz : ");
        chem = inp.nextInt();
        if (chem>100){
            System.out.println("Girilen not 0-100 aralığında olmalıdır. Bu sebeple bu ders hesaplanmayacaktır");
            dontGet++;
            chem = 0;
        }
        System.out.print("Müzik notunuzu giriniz : ");
        music = inp.nextInt();
        if (music>100){
            System.out.println("Girilen not 0-100 aralığında olmalıdır. Bu sebeple bu ders hesaplanmayacaktır");
            dontGet++;
            music = 0;
        }
        result = (double) (math + turkish + music + chem + phys) / (5 - dontGet);

        if (result<55){
            System.out.println("Sınıfta kaldınız !");
        }
        else {
            System.out.println("Sınıfı geçtiniz :) ");
        }


        System.out.println("Ortalamanız : " + result);

    }
}
