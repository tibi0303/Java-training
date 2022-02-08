package introcontrol;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Five number: ");

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();
            sum += number;
        }

        System.out.println("Sum: " + sum);
    }
}
