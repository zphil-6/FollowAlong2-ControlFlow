package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=5302s
//        while loops start at about 88:22 — stop at about 91:54
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 07 — while loops and do-while loops
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called WhileLoops.
//    Leave the "package part07;" line and the "public class WhileLoops" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
//
// If your program never stops: click the red square (Stop) in the Run window.


// loads the Scanner tool so the program can read keyboard input
import java.util.Scanner;

// creates the WhileLoops class for this program
public class WhileLoops {
    // starts the program when we run this file
    public static void main(String[] args) {
        // creates a Scanner object to read what the user types in the console
        Scanner scanner = new Scanner(System.in);
        // makes a String variable for the user's name, starting out completely empty
        String name = "";

        // starts a loop that will run the code inside at least one time before checking the condition
        do {
            // asks the user to type their name without jumping to a new line
            System.out.print("Enter your name: ");
            // grabs the whole line the user typed and stores it in the name variable
            name = scanner.nextLine();
            // keeps repeating the loop above if the user just hit Enter and left name blank
        } while (name.isBlank());

        // greets the user by name once they finally type a real answer
        System.out.println("Hello " + name);
    }
}
