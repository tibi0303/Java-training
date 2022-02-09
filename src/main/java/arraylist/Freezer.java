package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Freezer {
    public static void main(String[] args) {
        List<String> foods = new ArrayList<>();

        foods.add("bread");
        foods.add("apple");
        foods.add("eggs");
        foods.add("peach");
        foods.add("ham");

        System.out.print(foods.size() + ": ");

        for (String food: foods){
            System.out.print(food + ", ");
        }

        foods.remove(0);
        foods.remove(1);

        System.out.println();
        System.out.print(foods.size() + ": ");

        for (String food: foods){
            System.out.print(food + ", ");
        }

    }
}
