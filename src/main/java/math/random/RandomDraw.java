package math.random;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomDraw {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tibi", "Feri", "Rita", "Gábor", "János", "Sándor", "József", "Benedek", "Pál", "Attila");

        Random rnd = new Random();
        int rndNumb1 = rnd.nextInt(1,5);
        int rndNumb2 = rnd.nextInt(6,10);

        System.out.println("Winners: ");
        System.out.println(names.get(rndNumb1));
        System.out.println(names.get(rndNumb2));
    }
}
