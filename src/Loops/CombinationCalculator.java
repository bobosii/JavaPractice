package Loops;
import java.util.Scanner;
public class CombinationCalculate {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        int k,total = 1;
        System.out.print("Give a number for factorial calculation : ");
        k = scan.nextInt();

        for (int i = 1; i<=k;i++){
            total *= i;
        }
        System.out.println(total);

         */
        Scanner inp = new Scanner(System.in);
        int r,n,nFact = 1,rFact = 1,total,nMinusR,nMinusR_fact = 1;
        System.out.println("Please enter n : (C(n,r)) ");
        n = inp.nextInt();
        System.out.println("Please enter r : (C(n,r))");
        r = inp.nextInt();
        nMinusR = n-r;
        //We can get n & r Factorial in these for loops and also (n-r)!

        for (int i = 1; i<=n; i++){
            nFact *= i;
        }
        for (int i = 1; i<=r;i++){
            rFact *= i;
        }
        for (int i = 1; i<=nMinusR;i++){
            nMinusR_fact *= i;
        }
        System.out.println("N : " + nFact);
        System.out.println("R : " + rFact);
        System.out.println("n-r fact : " + nMinusR_fact );

        //Combination Calculating
        // C(n,r) = n! / (r! * (n-r)!

        total = nFact / (rFact * nMinusR_fact);
        System.out.println("Combination result is : " + total);



    }
}
