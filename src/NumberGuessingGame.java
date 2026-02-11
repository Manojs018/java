import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int secretNumber = (int) (Math.random()*100)+1;
        int attempts = 0;
        int guess;

        while (true) {
            System.out.print("Enter your guess: ");
            guess = in.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Your guess is too high");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low");

            }else {
                System.out.println("Congratulations! You guessed it!");
                System.out.println("Attempts taken: "+attempts);
                break;
            }

        }


    }
}
