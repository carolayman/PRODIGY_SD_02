import java.util.*;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To Our Guessing Game!");
        System.out.println("Your Guess Should Be From 1 to 1000:");

        int number = 1 + random.nextInt(1000);
        int guess = 0;
        int attempts = 0;
        boolean valid = false;

        while (true) {
        while (!valid) {
                System.out.print("Enter Your Guess : ");
            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();
                valid = true;
                attempts++;
            } else {
                System.out.println("WRONG , Try Again");
                scanner.next();
            }
            }
        if (guess == number) {
            System.out.println("Congratulations!");
            System.out.println("YOU WIN! OUR GUESSING NUMBER WAS --> " + number);
            break;
        }
        else if (guess > number) {
                System.out.println("Too High");
        } else {
                System.out.println("Too Low");
        }
        valid = false;
        }
        scanner.close();
    }
}