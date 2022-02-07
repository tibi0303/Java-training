package classstructureattributes;

import java.util.Scanner;

public class ClientMain {
    public static void main(String[] args) {
        Client client = new Client();

        System.out.print("Name: ");
        Scanner scName = new Scanner(System.in);
        client.name = scName.nextLine();

        System.out.print("Year: ");
        Scanner scYear = new Scanner(System.in);
        client.year = scYear.nextInt();

        System.out.print("Address: ");
        Scanner scAddress = new Scanner(System.in);
        client.address = scAddress.nextLine();

        System.out.print("Name: " +client.name+ ", " + "Year: " +client.year+ ", " +"Address: " +client.address);
    }
}
