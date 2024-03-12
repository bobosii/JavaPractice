package Loops;

public class Fibo {
    public static void main(String[] args) {
        int number1,number2,temp;
        number1 = 0;
        number2 = 1;

        for (int i = 1; i<=10;i++){
            System.out.print(number1 + " ");
            temp = number1+number2;
            number1=number2;
            number2=temp;

        }
    }
}
