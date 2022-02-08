package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What time is it? (hh:mm:ss)");
        System.out.print("Hour: ");
        int fHour = sc.nextInt();
        System.out.print("Minutes: ");
        int fMinute = sc.nextInt();
        System.out.print("Seconds: ");
        int fSeconds = sc.nextInt();

        Time firstTime = new Time(fHour,fMinute,fSeconds);
        System.out.println("Time: " + firstTime.toString());
        System.out.println("Time in minutes: " + firstTime.getInMinutes());

        System.out.println("What time is it? (hh:mm:ss)");
        System.out.print("Hour: ");
        int sHour = sc.nextInt();
        System.out.print("Minutes: ");
        int sMinute = sc.nextInt();
        System.out.print("Seconds: ");
        int sSeconds = sc.nextInt();

        Time secondTime = new Time(sHour,sMinute,sSeconds);
        System.out.println("Time: " + secondTime.toString());
        System.out.println("Time in seconds: " + secondTime.getInSeconds());

        System.out.println("Earlier? " + firstTime.earlierTime(secondTime));
    }
}
