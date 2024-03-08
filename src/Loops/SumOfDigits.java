package Loops;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int digitValue;
        int result = 0;
        System.out.print("Enter a number : ");

        number = input.nextInt();
        int tempNumber = number;

        while (tempNumber != 0){
            digitValue = tempNumber % 10;
            tempNumber /= 10;
            result+=digitValue;
        }
        System.out.println("The sum of digits : " + result);
    }
}
