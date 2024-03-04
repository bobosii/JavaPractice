package ConditionalStatements;
import java.util.Scanner;
public class AirLineTicketFeeCalculator {
    public static void main(String[] args) {
        int age,distance,roundTrip;
        double discount,totalPrice = 0,priceWithDiscount,roundTripDiscount = 0.2,feePerKm = 0.10;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your age : ");
        age = inp.nextInt();
        System.out.print("Enter distance : ");
        distance = inp.nextInt();
        System.out.println("Will your ticket one way or two way ?");
        System.out.println("Press 1 for One way ticket");
        System.out.println("Press 2 for Two way ticket");
        roundTrip = inp.nextInt();

        totalPrice = distance * feePerKm;

        if (age >= 0 && distance >= 0 && (roundTrip == 1 || roundTrip == 2)){
            if (roundTrip == 1){
                if (age < 12){
                    // 50% discount
                    discount = 0.5;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                } else if (age > 12 && age < 24) {
                    // 10% discount
                    discount = 0.1;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                } else if (age > 65) {
                    // 30% discount
                    discount = 0.3;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                }
            } else if (roundTrip == 2) {
                if (age < 12){
                    //50% discount and 20% discount
                    discount = 0.5;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                    priceWithDiscount = totalPrice * roundTripDiscount;
                    totalPrice = totalPrice - priceWithDiscount;
                    totalPrice = totalPrice * 2;
                } else if (age > 12 && age < 24) {
                    //10% discount and 20% discount
                    discount = 0.1;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                    priceWithDiscount = totalPrice * roundTripDiscount;
                    totalPrice = totalPrice - priceWithDiscount;
                    totalPrice = totalPrice * 2;
                } else if (age > 65) {
                    //30% discount and 20% discount
                    discount = 0.3;
                    priceWithDiscount = totalPrice * discount;
                    totalPrice = totalPrice - priceWithDiscount;
                    priceWithDiscount = totalPrice * roundTripDiscount;
                    totalPrice = totalPrice - priceWithDiscount;
                    totalPrice = totalPrice * 2;
                }else {
                    priceWithDiscount = totalPrice * roundTripDiscount;
                    totalPrice = totalPrice - priceWithDiscount;
                    totalPrice = totalPrice * 2;
                }
            }
            System.out.println("Total price is " + totalPrice);
        }else {
            System.out.println("Invalid value");
        }

    }
}
