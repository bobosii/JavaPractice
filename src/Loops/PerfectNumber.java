package Loops;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number : ");
        int number = inp.nextInt();
        int sum = 0;
        for (int i = 1; i < number;i++){
            if (number%i == 0){
                sum +=i;
            }
        }
        if (sum == number) {
            System.out.println("Perfect Number !! " + sum);
        }else {
            System.out.println("The entered number isn't perfect number :(");
        }


    }
}
