package ConditionalStatements;
import java.util.Scanner;
public class SortedFromSmallestToBiggest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number1,number2,number3;
        System.out.println("Welcome to Sorting program. This program will be sort your numbers smallest to biggest !");
        System.out.print("Enter number 1 : ");
        number1 = inp.nextInt();
        System.out.print("Enter number 2 : ");
        number2 = inp.nextInt();
        System.out.print("Enter number 3 : ");
        number3 = inp.nextInt();

        if (number1>number2 && number1>number3){
            if (number2>number3){
                System.out.println("The result is : ");
                System.out.println("number 3 < number 2 < number 1");
            } else if (number2<number3) {
                System.out.println("The result is : ");
                System.out.println("number 2 < number 3 < number 1");
            }
        } else if (number3>number2 && number3>number1) {
            if (number2>number1){
                System.out.println("The result is : ");
                System.out.println("number1 < number 2 < number 3");
            } else if (number2<number1) {
                System.out.println("The result is : ");
                System.out.println("number 2 < number 1 < number 3");
            }
        } else if (number2>number3 && number2>number1) {
            if (number3>number1){
                System.out.println("The result is : ");
                System.out.println("number 1 < number 3 < number 2");
            } else if (number3<number1) {
                System.out.println("The result is : ");
                System.out.println("number 3 < number 1 < number 2");
            }
        }
    }
}

