package ConditionalStatements;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int birthYear,birthWithMod;
        String horoscope = "";
        System.out.print("Enter your birth year for Chinese Zodiac calculation : ");
        birthYear = inp.nextInt();
        birthWithMod = birthYear % 12;

            switch (birthWithMod){
                case 0:
                    horoscope = "Monkey";
                    break;
                case 1:
                    horoscope = "Cockerel";
                    break;
                case 2:
                    horoscope = "Dog";
                    break;
                case 3:
                    horoscope = "Pig";
                    break;
                case 4:
                    horoscope = "Mouse";
                    break;
                case 5:
                    horoscope = "Ox";
                    break;
                case 6:
                    horoscope = "Tiger";
                    break;
                case 7:
                    horoscope = "Rabbit";
                    break;
                case 8:
                    horoscope = "Dragon";
                    break;
                case 9:
                    horoscope = "Sneak";
                    break;
                case 10:
                    horoscope = "Horse";
                    break;
                case 11:
                    horoscope = "Sheep";
                    break;
                default:
                    System.out.println("Invalid birth year");
            }
        System.out.println("Your horoscope is : " + horoscope);

    }
}
