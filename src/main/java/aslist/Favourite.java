package aslist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Favourite {
    public static void main(String[] args) {
        List<String> favouriteThings = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favourite actor: ");
        favouriteThings.add(sc.nextLine());
        System.out.println("What is your favourite animal: ");
        favouriteThings.add(sc.nextLine());
        System.out.println("What is your favourite film: ");
        favouriteThings.add(sc.nextLine());

        System.out.println(favouriteThings.size());

        System.out.print("Your favourite things: ");
        for (String thing: favouriteThings)
            System.out.print(thing + ", ");



    }
}
