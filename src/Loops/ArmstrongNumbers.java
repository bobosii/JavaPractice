package Loops;
import java.util.Scanner;
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,digitNumber = 0;
        int digitValue;
        System.out.print("Enter a number for see it is armstrong or not armstrong : ");
        number = input.nextInt();
        int result = 0, tempNumber = number, digitPow;
        while (tempNumber != 0){
            tempNumber /=10;
            digitNumber++;
        }
        tempNumber = number; // I'm using this because when we use in the real number in loop, we just lose the real number
        // that's why i'm using a tempNumber variable.

        // In this loop, we are trying to find digit numbers to get the exponent
        while (tempNumber != 0){
            digitValue = tempNumber % 10;
            tempNumber /= 10;
            digitPow = 1;
            for (int i = 1; i<=digitNumber;i++){
                digitPow *= digitValue;
            }
            result += digitPow;
        }
        if (result == number){
            System.out.println("This is an Armstrong NUMBER !!! \n" + result);
        }else {
            System.out.println("This is not an Armstrong number :( \n" + result);
        }


    }
}
