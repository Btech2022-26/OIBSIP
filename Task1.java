import java.util.Scanner;
import java.util.Random;

public class numberguess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;
        int attempts = 0;
        int score = 0;
        boolean gameWon = false;

        int randomNumber = random.nextInt(max - min + 1) + min;

        System.out.println("***************Welcome to Guess the Number!!!***************");
        System.out.println("I have selected a random number between " + min + " and " + max + ". Can you guess it?");
        System.out.println("You have 5 attempts to guess the number.");

        while (!gameWon) {
            int attemptsLeft = 5 - attempts;

            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                gameWon = true;
                System.out.println("Congrats!!!! You have guessed the number " + randomNumber + " correctly in " + attempts + " attempts.");
                score += 100 - (attempts * 5);
                System.out.println("Your final score is : " + score);
            } else if (userGuess < randomNumber) {
                System.out.println("Too low guessed! Attempts left: " + (attemptsLeft - 1));
            } else {
                System.out.println("Too high guessed! Attempts left: " + (attemptsLeft - 1));
            }

            if (attempts >= 5 && !gameWon) {
                System.out.println("Sorry!!! you have reached the maximum number of attempts.");
                System.out.println("The actual number was : " + randomNumber);
                
                break;
            }
        }
        scanner.close();
    }
}
