package Loops;

public class PrimeNumbersBetween1and100 {
    public static void main(String[] args) {

        int num = 100;

        for(int i = 2; i <= num; i++) {//until that number
            int count = 0;
            //check if that number has any factor
            for(int k2 = 2; k2<i; k2++) {
                if(i % k2 == 0) count++;
            }

            if(count == 0) System.out.print(i + " ");
        }
    }
}
