package Loops;
import java.util.Scanner;
public class FindMaxAndMin {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number,max,min,count;
        System.out.println("How many number do you enter ?");
        count = inp.nextInt();
        if(count>0){
            System.out.print("Enter 1st number : ");
            number = inp.nextInt();
            max = number;
            min = number;

            for (int i = 2; i<=count; i++){
                System.out.println("Enter " + i + "st number : ");
                number = inp.nextInt();

                if (number > max){
                    max = number;
                }
                if (number<min){
                    min = number;
                }

            }
            System.out.println("Min number : " + min);
            System.out.println("Max number : " + max);
        }
    }
}
