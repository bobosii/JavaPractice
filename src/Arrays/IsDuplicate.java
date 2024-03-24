package Arrays;
import java.util.Arrays;
public class IsDuplicate {
    static boolean isHave(int[] arr, int value){
        for (int i: arr){
            if (i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,7,9,10,6,8,8,4,2,2,10,11,3,7,9};
        int[] duplicate = new int[list.length];
        int firstIn = 0;
        for (int i = 0; i < list.length; i++){ // 1. döngü başlar
            for (int j = 0; j < list.length; j++){// 2. döngü başlar
                if ((j != i) && (list[i] == list[j])){ // 1. ve 2. döngülerin elinde olan sayıların aynı olup olmadıklarını
                    // & j nin i den önde olduğunu kontrol eder.
                    if (list[i] % 2 == 0){ // sadece çiftleri almamızı sağlar
                    if (!isHave(duplicate,list[i])){
                        // Eğer duplicate arrrayinde yazılmış ise tekrardan yazmaz.
                        duplicate[firstIn] = list[i];
                        firstIn++;
                    }
                    break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
