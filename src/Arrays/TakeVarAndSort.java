package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class TakeVarAndSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < size; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Dizinin küçükten büyüğe sıralanmış hali:");
        for (int num : arr) {
            System.out.print(num + " ");
        }



    }


}
