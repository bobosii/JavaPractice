package FundementalConceptsAndVariables;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi = 3.14,r,alan,cevre,merkezAci,daireDilim;
        System.out.print("Yarıçapı giriniz : ");
        r = input.nextDouble();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.printf("Dairenin alanı %.2f, Dairenin çevresi %.2f\n",alan,cevre);

        System.out.print("Merkez açı ölçüsünü veriniz : ");
        merkezAci = input.nextDouble();

        daireDilim = (pi * (r*r) * merkezAci) / 360;
        System.out.printf("Dairenin dilim alanı = %.2f",daireDilim);




    }
}
