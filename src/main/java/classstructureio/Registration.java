package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.print("Please, enter your name: ");
        Scanner scName = new Scanner(System.in);
        String name = scName.nextLine();

        System.out.print("Please, enter your email: ");
        Scanner scEmail = new Scanner(System.in);
        String email = scEmail.nextLine();

        System.out.println("Your registered was successful!");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}
