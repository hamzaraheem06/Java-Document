import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        try (Formatter out = new Formatter("Good_People.txt")) {
            Scanner input = new Scanner(System.in);

            while (input.hasNext()) {
                try {
                    out.format("%20s%15s", input.next(), input.next());
                } catch (NoSuchElementException ex) {
                    System.out.println(ex.getMessage());
                }
            }

        } catch (SecurityException | FileNotFoundException | FormatterClosedException e) {
            System.out.println(e.getMessage());
        }
    }
}
