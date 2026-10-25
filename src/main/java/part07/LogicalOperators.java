package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4843s
//        logical operators start at about 80:43 — stop at about 87:47
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 07 — the logical operators: && (and), || (or), ! (not)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called LogicalOperators.
//    Leave the "package part07;" line and the "public class LogicalOperators" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


// brings in the Scanner tool so we can read what the user types
import java.util.Scanner;

// creates the LogicalOperators class that holds our program
public class LogicalOperators {
    // the starting point of the program when we click run
    public static void main(String[] args) {
        // creates a number variable named temp and sets it to 25
        int temp = 25;

        // checks if the temperature is strictly greater than 30
        if (temp > 30) {
            // prints that it is hot if temp is over 30
            System.out.println("It is hot outside!");
            // if not over 30, checks if temp is both 20 or more AND 30 or less
        } else if (temp >= 20 && temp <= 30) {
            // prints that it is warm when temp is between 20 and 30
            System.out.println("It is warm outside!");
            // runs if neither of the temperature checks above were true
        } else {
            // prints that it is cold when temp is below 20
            System.out.println("It is cold outside!");
        }

        // sets up a new Scanner to listen to keyboard input
        Scanner scanner = new Scanner(System.in);

        // asks the player to type q or Q if they want to quit
        System.out.println("You are playing a game! Press q or Q to quit");
        // reads the word the user typed and saves it in response
        String response = scanner.next();

        // true when what the player typed is NOT "q" AND also NOT "Q"
        if (!response.equals("q") && !response.equals("Q")) {
            // tells the player they are still playing since they didn't type q or Q
            System.out.println("You are still playing the game *pew pew*");
            // runs if the player did type either q or Q
        } else {
            // prints a message saying the game ended
            System.out.println("You quit the game");
        }
    }
}
