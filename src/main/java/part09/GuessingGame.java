package part09;

// Part 09 — CHECKPOINT. No video in this part.
// Video (only if you need a reminder): https://www.youtube.com/watch?v=xk4_1vDrzzo
//   user input (Scanner) — part 03 · random numbers — part 05
//   if statements — part 06 · while loops — part 07
//
// SECTION A — BUILD: write a number guessing game in this class, starting from nothing.
//    The README has the full list of rules and a sample run.
//    Leave the "package part09;" line and the class line alone. Type everything else,
//    including main and the import lines.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.


// imports Random so the computer can pick a random secret number
import java.util.Random;
// imports Scanner so the program can read numbers typed by the player
import java.util.Scanner;

// creates the GuessingGame class that holds our game code
public class GuessingGame {
    // main method where the game starts running when we click play
    public static void main(String[] args) {
        // creates a Scanner object to listen to what the player types on the keyboard
        Scanner scanner = new Scanner(System.in);
        // creates a Random object to generate our random number
        Random random = new Random();

        // nextInt(100) gives 0 to 99, so adding 1 shifts the range to 1 to 100
        int secret = random.nextInt(100) + 1;
        // stores the player's current guess, starting at 0 so the while loop can start
        int guess = 0;
        // keeps track of how many guesses the player has made, starting at 0
        int count = 0;

        // tells the player the range of numbers the computer is thinking of
        System.out.println("I'm thinking of a number between 1 and 100.");

        // keeps looping and asking for guesses as long as the player hasn't guessed the secret number
        while (guess != secret) {
            // uses print instead of println so the player types their number on the same line
            System.out.print("Your guess: ");
            // reads the whole number the player typed and saves it in guess
            guess = scanner.nextInt();
            // adds 1 to our guess counter every time the player makes an attempt
            count++;

            // checks if the player's guess is larger than the secret number
            if (guess > secret) {
                // tells the player their guess was too big so they know to guess lower next time
                System.out.println("Too high!");
                // if it wasn't too high, checks if the player's guess is smaller than the secret number
            } else if (guess < secret) {
                // tells the player their guess was too small so they know to guess higher next time
                System.out.println("Too low!");
            }
        }

        // runs once the loop finishes to congratulate the player and show their total guess count
        System.out.println("Correct! You got it in " + count + " guesses.");
    }
}