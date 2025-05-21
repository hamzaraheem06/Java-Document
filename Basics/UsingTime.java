import java.time.LocalTime;

// define: LocalTime is just like LocalDate, immutable class that handles all important useful time storage and maniputlation operations on time values.

// it stores hour, minutes, seconds as well us upto nanoseonds. making it a very useful class for time storage due to its precision

// note: almost all the methods of LocalTime are similar to LocalDate, the only difference occurs in arguments i.e. time values are passed instead of date values.

public class UsingTime {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now(); // returns current time 
        // System.out.println(currentTime); // 21:09:01.136578800 

        // to set custom time value, use .of(h, m) or .of(h, m, s) or .of(h, m, s, ms) method

        LocalTime cutOffTime = LocalTime.of(23, 59, 59);

        LocalTime time = LocalTime.parse(("12:15:50"));
        System.out.println(time);
        // System.out.println(cutOffTime); // 23:59:59

        // plus and minus in time variables are also done using similar methods as in LocalDate
        LocalTime later = currentTime.plusHours(2).plusMinutes(15);
        // System.out.println("Later: " + later); // Later: 23:25:55.356664100

        // formatter is also similar to LocalDate
    }
}
