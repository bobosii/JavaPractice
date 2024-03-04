package ConditionalStatements;
import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please provide an username : ");
        userName = inp.nextLine();
        System.out.print("Please provide a password : ");
        password = inp.nextLine();

        if (userName.equals("emirhan") && password.equals("day")) {
            System.out.println("Welcome !");
        } else {
            System.out.println("Wrong password or username ?");
            System.out.println("Do you want to reset password ?");
            System.out.println("Press 1 for reset your password");
            System.out.println("Press 2 for Exit");
            select = inp.nextInt();
            inp.nextLine();
            // select = inp.nextInt(); sadece bu kodu yazdığımda program input beklemeden bitiriyordu
            // bu sebeple internetten yaptığım araştırmalarla inp.nextLine(); kodunu buldum

            if (select == 1) {
                System.out.print("Please provide a new password : ");
                newPassword = inp.nextLine();
                if (newPassword.equals("day")) {
                    System.out.println("The password you entered cannot be the same as the old one");
                } else {
                    System.out.println("Successful !");
                    System.out.println("Your new password is : " + newPassword);
                }

            } else if (select == 2) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Exiting..");
            }

        }
    }
}
