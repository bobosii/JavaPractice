package Methods;
import java.util.Scanner;

public class AdvancedCalculator {

    static void sum(){
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for get progress : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for get progress : ");
        number2 = input.nextInt();
        result = number1 + number2;
        System.out.println("Result is : " + result);
    }
    static void minus(){
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for get progress : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for get progress : ");
        number2 = input.nextInt();
        result = number1 - number2;
        System.out.println("Result is : " + result);
    }
    static void plus(){
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for get progress : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for get progress : ");
        number2 = input.nextInt();
        result = number1 * number2;
        System.out.println("Result is : " + result);
    }
    static void divide(){
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for get progress : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for get progress : ");
        number2 = input.nextInt();
        result = number1 / number2;
        System.out.println("Result is : " + result);
    }
    static void power(){
        int number1,number2,result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for base value : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for exponent value : ");
        number2 = input.nextInt();
        for (int i = 1; i<= number2; i++ ){
            result *= number1;
        }
        System.out.println("Result is : " + result);
    }
    static void factorial(){
        int fact,result = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a number for get factorial : ");
        fact = input.nextInt();
        while (fact != 0){
            result *= fact;
            fact--;
        }
        System.out.println("Result is : " + result);
    }
    static void mod(){
        int number1,number2,result;
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number 1 for get mod : ");
        number1 = input.nextInt();
        System.out.print("Please provide your number 2 for mod value : ");
        number2 = input.nextInt();
        result = number1 % number2;
        System.out.println("Result is : " + result);
    }
    static void rectangular(){
        int longedge,shortedge,perimeter,area;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter longedge : ");
        longedge = input.nextInt();
        System.out.print("Please enter shortedge : ");
        shortedge = input.nextInt();
        perimeter = (longedge*2) + (shortedge*2);
        area = longedge*shortedge;
        System.out.println("Reactangular perimeter is : " + perimeter +
                "\nReactangular area is : " + area);
    }

    public static void main(String[] args) {
        int select;
        String menu = ("1: Addition\n" +
                "2: Minus\n" +
                "3: Plus\n" +
                "4: Divide\n" +
                "5: Power\n" +
                "6: Factorial\n" +
                "7: Get Mod\n" +
                "8: Rectangular perimeter and area\n" +
                "0: Exit" );

        do {
            System.out.println(menu);
            System.out.println("Please enter what you want ?");
            Scanner input = new Scanner(System.in);
            select = input.nextInt();
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    plus();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangular();
                    break;
                case 0:
                    System.out.println("Exitted");
                    break;
                default:
                    System.out.println("Invalid number, please enter again ");

            }
        }while (select != 0);
    }
}
