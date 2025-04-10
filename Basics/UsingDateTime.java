import java.time.LocalDate;
// define: LocalDate class is an immutable class that contains date only values i.e. 2025-04-10
// it allows us to perform different useful operations on dates, altough there are alot of methods in LocalDate class we only discuss commonly used methods.

import java.time.format.DateTimeFormatter; // define: this class is used to format a date and/or time value into a String format. 

public class UsingDateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // .now() returns current date
        // System.out.println(today); // 2025-04-10

        LocalDate birthDate = LocalDate.of(2006, 9, 25); // .of(year, month, day) used to set a custome date value
        // System.out.println(birthDate); // 2006-09-25

        LocalDate anotherBirthDate = LocalDate.parse("2006-05-14"); // .parse("yyyy-mm-dd") parses the string in this format to LocalDate object
        // System.out.println(anotherBirthDate); // 2006-05-14

        // .plusDays(days), .minusDays(days) are used to update(increment or decrement) date's value
        // similar to these methods we also have plus and minus for months and years.
        // birthDate = birthDate.plusDays(14);
        // birthDate = birthDate.plusMonths(5);
        // birthDate = birthDate.plusYears(anotherBirthDate.getYear()); // getters are also available for LocalDate class to get individual values of day, month, year
        // note: We know that the LocalDate is immutable class so these methods donot change the original object rather create a copy of that object, do the updation and return a new object;

        // System.out.println(birthDate); // 4013-03-09

        // .isBefore(date), .isEqual(date), and .isAfter(date) methods are used to compare two date values

        // System.out.println(birthDate.isBefore(anotherBirthDate)); // false

        // to display date in a particular pattern, we use LocalDate along with another class in java.time.format.DateTimeFormatter

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // mm is for minutes use 'MM' for month

        String dateBirthFormatted = birthDate.format(formatter); // .format(formatter) returns a String value of date in the pattern defined in the formatter

        // System.out.println(dateBirthFormatted); // 25/09/2006


    } 
}
