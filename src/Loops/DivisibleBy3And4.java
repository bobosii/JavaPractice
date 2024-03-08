package Loops;
import java.util.Scanner;

public class DivisibleBy3And4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for get evens : ");
        int k,cycle = 0,result = 0,average;
        k = input.nextInt();
        for (int i = 0; i<=k;i++){
            if (i%3 == 0 && i%4 == 0){
                cycle++;
                result +=i;
            }
        }
        average = result/cycle;
        System.out.println(average);

    }
}

