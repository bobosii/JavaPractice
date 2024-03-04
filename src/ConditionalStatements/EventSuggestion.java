package ConditionalStatements;
import java.util.Scanner;
public class EventSuggestion {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Enter the air temperature : ");
        heat = inp.nextInt();

        if (heat <= 5){
            System.out.println("You can go to do skiing");
        } else if (heat >= 5 && heat <= 15) {
            System.out.println("You can go to do cinema");
        }else if (heat > 15 && heat < 25 ){
            System.out.println("You can go to do picnic");
        } else if (heat >= 25) {
            System.out.println("You can go to do swim");
        }
    }
}
