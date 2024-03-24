package Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class isNear {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-788,2,0};
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number for isNear control : ");
        int var = inp.nextInt();
        int maxN = 0;
        int minN = 0;
        Arrays.sort(list);

        for (int i = list.length - 1; i>=0;i-- ){
            if (list[i] <= var){
                minN = list[i];
                break;
            }
        }
        for (int i = 0; i< list.length; i++){
            if (list[i]>= var){
                maxN = list[i];
                break;
            }
        }



        System.out.println("Input is : " + var);
        System.out.println("Min : " + minN);
        System.out.println("Max : " + maxN);

    }

}
