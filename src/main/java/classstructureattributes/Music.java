package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();

        System.out.println("What is your favorite music?");

        System.out.print("Band: ");
        Scanner scBand = new Scanner(System.in);
        song.band = scBand.nextLine();

        System.out.print("Title: ");
        Scanner scTitle = new Scanner(System.in);
        song.title = scTitle.nextLine();

        System.out.print("Length: ");
        Scanner scLength = new Scanner(System.in);
        song.length = scLength.nextInt();

        System.out.print(song.band+ " - " +song.title+ " (" +song.length+ " minute)");




    }
}
