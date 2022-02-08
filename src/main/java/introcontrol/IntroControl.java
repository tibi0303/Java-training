package introcontrol;

public class IntroControl {
    public int subtractTenIfGreaterThanTen(int number){
        if(number <= 10)
            return number;
        else
            return number - 10;
    }

    public String describeNumber(int number){
        if(number > 0)
            return "not zero";
        else
            return "zero";
    }

    public String greetingToJoe(String name){
        if(name.equals("Joe"))
            return "Hello Joe";
        else
            return "";
    }

    public int calculateBonus(int sale){
        if(sale >= 1000000)
            return sale / 10;
        else
            return 0;
    }

    public void printNumbers(int max){
        for (int i = 0; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    public void printNumbersBetween(int min, int max){
        for (int i = min; i <= max ; i++) {
            System.out.print(i + " ");
        }
    }

    public void printNumbersBetweenAnyDirection(int a, int b){
        if ( a > b ) {
            for (int i = a; i >= b; i--) {
                System.out.print(i + " ");
            }
        }
        else{
            for (int i = a; i <= b; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public void printOddNumbers(int max){
        for (int i = 1; i <= max ; i++) {
            if(i % 2 != 0)
                System.out.print(i + " ");
        }
    }
}
