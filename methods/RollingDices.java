import java.util.Random;
import java.util.Scanner;

public class RollingDices {

    public int rollDices() {
        Random dice = new Random();
        int sum = 0;
        // rolling first time
        sum += dice.nextInt(6) + 1;
        // rolling second time
        sum += dice.nextInt(6) + 1;

        return sum;
    }
    public static void main(String[] args) {
        RollingDices game = new RollingDices();
        Scanner input = new Scanner(System.in);
        System.out.print("Do you want to play? (y for yes)");
        char choice = input.nextLine().charAt(0);

        if(choice != 'y') {
            return;
        }

        int point = 0;
        int sum;

        do {
            sum = game.rollDices();
            if(sum == 7 || sum == 11 && point == 0) {
                System.out.println("You won.");
                return;
            }
            
            point = sum;
            sum = game.rollDices();

            if(sum == point) {
                System.out.println("You won.");
                return;
            }

        }  while(sum != 7);
        
        System.out.println("House won.");
        input.close();
        }
}
