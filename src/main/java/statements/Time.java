package statements;

public class Time {
    private int hour;
    private int minute;
    private int seconds;

    public Time(int hour, int minute, int seconds) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getInMinutes(){
        return (hour*60) + minute;
    }

    public int getInSeconds(){
        return ((hour*60) + minute)*60 + seconds;
    }

    public boolean earlierTime(Time time){
        return this.getInSeconds() < time.getInSeconds();
    }

    public String toString(){
        return getHour() + ":" + getMinute() + ":" + getSeconds();
    }
}
