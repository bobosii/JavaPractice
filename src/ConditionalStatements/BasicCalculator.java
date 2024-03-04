package ConditionalStatements;
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
        double number1,number2,result;
        int select;
        Scanner input = new Scanner(System.in);

        System.out.println("1 : Sum");
        System.out.println("2 : Subtract");
        System.out.println("3 : Multiple");
        System.out.println("4 : Divide");
        System.out.print("Please select the action you want : ");
        select = input.nextInt();

        System.out.print("Please provide a number 1 : ");
        number1 = input.nextDouble();
        System.out.print("Please provide a number 2 : ");
        number2 = input.nextDouble();

        switch (select){
            case 1:
                result = number1 + number2;
                System.out.println("Result : " + result);
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Result : " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Result : " + result);
                break;
            case 4:
                result = number1 / number2;
                System.out.println("Result : " + result);
                break;
            default:
                System.out.println("PROVIDE A NUMBER!");
        }



    }
}
