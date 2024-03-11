package Loops;
import java.util.Scanner;
public class EbobEkok {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi1,sayi2,ebob=1,ekok=1;
        System.out.print("1. Sayıyı giriniz : ");
        sayi1 = inp.nextInt();
        System.out.print("2. Sayıyı giriniz : ");
        sayi2 = inp.nextInt();
        while(sayi1 > 0 && sayi2 > 0){
            if (sayi2 > sayi1){
                //döngüye tersten başlar ve direk ebobu bulur. Daha verimli olduğunu düşünüyorum
                for (int k = sayi1; k>= 1; k--){
                    //sayı 1 in k ile modu 0 ise ortak bölendir. sayi1 % k == 0 olana kadar döngü döer.
                    if (sayi1 % k == 0 && sayi2 % k == 0){
                        ebob = k;
                        System.out.println("Ebob : " + ebob);
                        break;
                    }
                }
                //ekoku bulmak için çalışır. İlk ortak böleni bulduğu an durur. bu sebepten ötürü verimlidir.
                for (int a = 1; a<=(sayi1*sayi2);a++){
                    //sayı 1 ile sayı 2 nin modu 0 a eşitse ortak kattır.
                    if (a % sayi1 == 0 && a % sayi2 == 0){
                        ekok = a;
                        System.out.println("Ekok : " + ekok);
                        break;
                    }
                }
                //aynı işlemler sayı2 nin sayı1 den büyük olduğu durumda çalışan kısım.
            } else if (sayi2 > sayi1) {
                for (int k = sayi2; k>= 1; k--){
                    if (sayi1 % k == 0 && sayi2 % k == 0){
                        ebob = k;
                        System.out.println("Ebob : " + ebob);
                        break;
                    }
                }
                for (int a = 1; a<=(sayi1*sayi2);a++){
                    if (a % sayi2 == 0 && a % sayi1 == 0){
                        ekok = a;
                        System.out.println("Ekok : " + ekok);
                        break;
                    }
                }
            }
            break;
        }

    }
}
