package Methods;
import java.util.Scanner;
public class PalindromNumber {
    static boolean isPalindrom(int number){
        int temp = number,revereseNumber = 0,lastNumber;
        while (temp != 0){
            lastNumber = temp % 10;
            revereseNumber = (revereseNumber * 10) + lastNumber;
            temp = temp / 10;
        }
        if (revereseNumber == number){
            System.out.println(revereseNumber + " is a palindrom number ! ");
            return true;
        }else {
            System.out.println(revereseNumber + " is not a palindrom number");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter a number for query : ");
        int number = scn.nextInt();
        isPalindrom(number);
    }
}
