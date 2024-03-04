package ConditionalStatements;
import java.util.Scanner;
public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int year;

        System.out.print("Enter year : ");
        year = inp.nextInt();

        if ((year % 4 == 0)){
            System.out.println(year + " is leap year.");
        }else if (year % 400 == 0) {
            System.out.println(year + " is leap year.");
        }else {
            System.out.println(year + " is not leap year.");
        }

    }
}
