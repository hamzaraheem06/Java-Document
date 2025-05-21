import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {

    }

    public void setTime(int hour, int minute, int second) {
        // since hour from 0 to 23, minute from 0 to 59, second 0 to 59
        if(hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("Hour, minute, and/or second is/are out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() {
        // hh:mm::ss
        return String.format("%2s:%2s:%2s", hour, minute, second);
    }

    public String toString() {
        // hh:mm:ss am/pm
        int h = (hour == 0 || hour == 12)? 12 : hour % 12;
        return String.format("%2s:%2s:%2s %2s", h, minute, second, (hour < 12)? "AM" : "PM");
    }

    public void displayTime() {
        System.out.printf("Current Time\n\nUniversal Time: %s\nStandard Time: %s\n\n", toUniversalString(), toString());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Time t1 = new Time();
        boolean isSet = false;

        do {
            try {
                System.out.println("Enter time: (hh, mm, ss) ");
                t1.setTime(in.nextInt(), in.nextInt(), in.nextInt());
                isSet = true;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getLocalizedMessage());
            }
        } while(!isSet);

        t1.displayTime();
    }
}
