package FundementalConceptsAndVariables;
import java.util.Scanner;
public class TriangleStudies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*int a,b;
        System.out.print("Dik kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("Diğer kenarı giriniz : ");
        b = input.nextInt();

        double c = Math.sqrt((a*a) + (b*b));
        double triangleArea = a * b / 2.0;
        System.out.println("Hipotenüs = " + c);
        System.out.println("Üçgenin alanı = " + triangleArea);
         */
        int a,b,c,cevre;
        double alan;
        System.out.print("1. Kenarı giriniz : ");
        a = input.nextInt();
        System.out.print("2. Kenarı giriniz : ");
        b = input.nextInt();
        System.out.print("3. Kenarı giriniz : ");
        c = input.nextInt();

        cevre = (a+b+c) / 2;
        alan = Math.sqrt(cevre * (cevre - a) * (cevre - b) * (cevre - c));
        System.out.println("Üçgenin alanı = " + alan);


    }
}
