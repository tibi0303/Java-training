package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(week[1]);
        System.out.println(week.length);

        boolean[] trueFalse = new boolean[6];
        for (int i = 1; i < trueFalse.length; i++) {
            trueFalse[i] = !trueFalse[i - 1];
        }
        for ( boolean b: trueFalse) {
            System.out.print(b + " ");
        }
    }
}
