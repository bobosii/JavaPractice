package Arrays;

import java.util.Arrays;

public class DuplicateCounter {
    public static void main(String[] args) {
        int[] array = {10,20,20,10,10,20,5,20};

        Arrays.sort(array);
        int currentNum = array[0];
        int counter = 1;

        for (int i = 1; i < array.length; i++){
            if (array[i] == currentNum){
                counter++;
            }else {
                System.out.println(currentNum + " Sayısı " + counter + " Kere tekrar etti !");
                currentNum = array[i];
                counter = 1;
            }

        }
        System.out.println(currentNum + " Sayısı " + counter + " Kere tekrar etti !");
    }
}
