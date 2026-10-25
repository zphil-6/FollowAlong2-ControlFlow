package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4128s
//        if statements start at about 68:48 — stop at about 74:54
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 06 — if, else if, else
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called IfStatements.
//    Leave the "package part06;" line and the "public class IfStatements" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.

public class IfStatements {

    // The main method where the program begins execution
    public static void main(String[] args) {

        // Declares an integer variable named age and sets its value to 75
        int age = 75;

        // Checks if the value of age is equal to 75 (or >= 75 depending on the video step)
        if (age == 75) {
            // Prints "OK boomer!" to the console if the first condition is true
            System.out.println("OK boomer!");
            // Checks if age is 18 or older when the previous condition is false
        } else if (age >= 18) {
            // Prints "You are an adult!" to the console if age is at least 18
            System.out.println("You are an adult!");
            // Checks if age is 13 or older when all previous conditions are false
        } else if (age >= 13) {
            // Prints "You are a teenager!" to the console if age is between 13 and 17
            System.out.println("You are a teenager!");
            // Runs as a fallback if none of the conditions above are true
        } else {
            // Prints "You are not an adult!" to the console if age is under 13
            System.out.println("You are not an adult!");
            // Closes the else block
        }

        // Closes the main method
    }

// Closes the IfStatements class
}
