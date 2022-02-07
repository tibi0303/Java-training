package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.print("First number: ");
        Scanner firstNumber = new Scanner(System.in);
        int fNumb = firstNumber.nextInt();

        System.out.print("Second number: ");
        Scanner secondNumber = new Scanner(System.in);
        int sNumb = secondNumber.nextInt();

        System.out.println(fNumb + " + " + sNumb);
        int sum = fNumb + sNumb;
        System.out.println("The result: " + sum);
    }
}
