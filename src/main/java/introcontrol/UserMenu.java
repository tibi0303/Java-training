package introcontrol;

import java.util.Scanner;

public class UserMenu {
    public static void main(String[] args) {
        System.out.println("1. Felhasználók listázása");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();

        if(menu == 1)
            System.out.println("Felhasználók listázása");
        if(menu == 2)
            System.out.println("Felhasználó felvétele");
    }
}
