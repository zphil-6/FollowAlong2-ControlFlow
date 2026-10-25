package part08;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5836s
//        starts at 1:37:16 — stop at about 1:42:48, at "well ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 6–10
//
// Part 08 — nested loops (a loop inside another loop)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called NestedLoops.
//    Leave the "package part08;" line and the class line alone. Type everything else.
//    When you type Scanner, IntelliJ will want an import. See the README.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.


// imports Scanner so we can read what is typed in the console
import java.util.Scanner;

// creates the NestedLoops class for this program
public class NestedLoops {
    // main method where Java begins executing the program
    public static void main(String[] args) {
        // creates a Scanner object to listen to keyboard input
        Scanner scanner = new Scanner(System.in);
        // declares a whole number variable to hold how many rows we want
        int rows;
        // declares a whole number variable to hold how many columns we want
        int columns;
        // creates a String variable for the character we want to draw with, starting empty
        String symbol = "";

        // asks the user to type in the number of rows
        System.out.println("Enter number of rows:");
        // reads the whole number the user typed and saves it in rows
        rows = scanner.nextInt();
        // asks the user to type in the number of columns
        System.out.println("Enter number of columns:");
        // reads the whole number the user typed and saves it in columns
        columns = scanner.nextInt();
        // asks the user what character or symbol they want to print
        System.out.println("Enter symbol to use:");
        // grabs the symbol the user typed and stores it in the symbol variable
        symbol = scanner.next();

        // outer loop starts at 1 and runs once for each row up to the user's rows number
        for (int i = 1; i <= rows; i++) {
            // moves the cursor down to a brand new line before starting each row
            System.out.println();
            // inner loop starts at 1 and runs once for every column inside the current row
            for (int j = 1; j <= columns; j++) {
                // uses print instead of println so all symbols in the row stay side by side
                System.out.print(symbol);
            }
        }
    }
}
