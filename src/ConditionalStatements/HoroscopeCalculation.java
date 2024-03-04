package ConditionalStatements;
import java.util.Scanner;

public class HoroscopeCalculation {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int month,day;
        boolean isError = false;
        String horoscope = null;

        System.out.print("which month were you born in ");
        month = inp.nextInt();
        System.out.print("which day were you born in ");
        day = inp.nextInt();

        if (month == 1){
            if (day >= 1 && day <= 31){
                if (day < 22){
                    horoscope = "Capricorn";
                } else if (day > 22) {
                    horoscope = "Aquarius";
                }
            }else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 29){
                if (day < 20){
                    horoscope = "Aquarius";
                }else {
                    horoscope = "Pisces";
                }
            }else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31){
                if (day < 21){
                    horoscope = "Pisces";
                }else {
                    horoscope = "Aries";
                }
            }else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 31){
                if (day < 21){
                    horoscope = "Aries";
                }else {
                    horoscope = "Taurus";
                }
            }else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31){
                if (day < 22){
                    horoscope = "Taurus";
                }else {
                    horoscope = "Gemini";
                }
            }else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Gemini";
                }else {
                    horoscope = "cancer";
                }
            }else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "cancer";
                }else {
                    horoscope = "Leo";
                }
            }else {
                isError = true;
            }
        }else if (month == 8) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Leo";
                }else {
                    horoscope = "Virgo";
                }
            }else {
                isError = true;
            }
        }else if (month == 9) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Virgo";
                }else {
                    horoscope = "Libra";
                }
            }else {
                isError = true;
            }
        }else if (month == 10) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Libra";
                }else {
                    horoscope = "Scorpio";
                }
            }else {
                isError = true;
            }
        }else if (month == 11) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Scorpio";
                }else {
                    horoscope = "Sagittarius";
                }
            }else {
                isError = true;
            }
        }else if (month == 12) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Sagittarius";
                }else {
                    horoscope = "Capricorn";
                }
            }else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (isError == true){
            System.out.println("Invalid month or day");
        }else{
            System.out.println("Your horoscope is : " + horoscope);
        }


    }
}
