package Loops;
import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int balance = 1500;
        String userName,password;
        int right = 3;
        int select,withDraw,deposit;
        while (right > 0){
            System.out.print("Enter your user name : ");
            userName = inp.nextLine();
            System.out.print("Enter your password : ");
            password = inp.nextLine();

            if (userName.equals("emir") && password.equals("123")){
                System.out.println("Welcome to Isik Bank What do you want to do ?");

                do {
                    System.out.println("1-Withdraw Money\n" +
                            "2-Deposit Money\n" +
                            "3-Check your balance\n" +
                            "4-Exit");
                    select = inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.println("How much money do you want to withdraw ?");
                            withDraw = inp.nextInt();
                            balance -= withDraw;
                            System.out.println("Your new balance is : " + balance);
                            break;
                        case 2:
                            System.out.println("How much money do you want to deposit ?");
                            deposit = inp.nextInt();
                            balance += deposit;
                            System.out.println("Your new balance is : " + balance);
                            break;
                        case 3:
                            System.out.println("Your balance is : " + balance);
                            break;
                    }
                }while (select !=4);
                break;
            }else {
                right--;
                if (right > 0 ){
                    System.out.println("Valid username or password please try again !");
                    System.out.println("You have left : " + right + " rights");
                }else{
                    System.out.println("You have no rights anymore, your bank account is blocked !");
                }

            }
        }


    }
}
