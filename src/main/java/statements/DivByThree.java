package statements;

import java.util.Scanner;

public class DivByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        System.out.println(number % 3 == 0 ? "divisible by 3" : "not divisible by 3");
    }
}
