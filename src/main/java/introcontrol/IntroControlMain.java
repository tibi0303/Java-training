package introcontrol;

public class IntroControlMain {
    public static void main(String[] args) {
        IntroControl ic = new IntroControl();

        System.out.println(ic.subtractTenIfGreaterThanTen(20));
        System.out.println(ic.subtractTenIfGreaterThanTen(5));

        System.out.println(ic.describeNumber(0));
        System.out.println(ic.describeNumber(11));

        System.out.println(ic.greetingToJoe("Joe"));
        System.out.println(ic.greetingToJoe("Hello"));

        System.out.println(ic.calculateBonus(10000));
        System.out.println(ic.calculateBonus(10000000));

        ic.printNumbers(50);
        System.out.println();
        ic.printNumbersBetween(32,78);
        System.out.println();
        ic.printNumbersBetweenAnyDirection(23,57);
        System.out.println();
        ic.printNumbersBetweenAnyDirection(57,23);
        System.out.println();
        ic.printOddNumbers(30);
    }
}
