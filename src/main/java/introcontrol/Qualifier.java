package introcontrol;

import java.util.Scanner;

public class Qualifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();

        if( number > 100 )
            System.out.println("Nagyobb mint száz!");
        else
            System.out.println("Száz, vagy kissebb!");
    }
}
