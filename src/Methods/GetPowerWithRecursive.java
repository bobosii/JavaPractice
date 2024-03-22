package Methods;
import java.util.Scanner;
public class GetPowerWithRecursive {
    static int power(int base,int exponent){
        if (base == 1 || exponent == 0){
            return 1;
        }else{
            return base * power(base, exponent-1);
        }
    }
    public static void main(String[] args) {
        int base,exponent;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter base value : ");
        base = inp.nextInt();
        System.out.print("Enter exponent value : ");
        exponent = inp.nextInt();
        System.out.println("Result is : " + power(base,exponent));
    }
}
