package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

// Defines the Switches class for this file
public class Switches {
    // Starts the main method where the program runs
    public static void main(String[] args) {
        // Creates a String variable named day and stores "Pizza" in it
        String day = "Pizza";

        // Starts a switch statement that checks the value stored in day
        switch (day) {
            // Checks if the value of day matches "Sunday"
            case "Sunday":
                // Prints "It is Sunday" to the console
                System.out.println("It is Sunday");
                // Exits the switch statement so it doesn't run the next cases
                break;
            // Checks if the value of day matches "Monday"
            case "Monday":
                // Prints "It is Monday" to the console
                System.out.println("It is Monday");
                // Exits the switch statement
                break;
            // Checks if the value of day matches "Tuesday"
            case "Tuesday":
                // Prints "It is Tuesday" to the console
                System.out.println("It is Tuesday");
                // Exits the switch statement
                break;
            // Checks if the value of day matches "Wednesday"
            case "Wednesday":
                // Prints "It is Wednesday" to the console
                System.out.println("It is Wednesday");
                // Exits the switch statement
                break;
            // Checks if the value of day matches "Thursday"
            case "Thursday":
                // Prints "It is Thursday" to the console
                System.out.println("It is Thursday");
                // Exits the switch statement
                break;
            // Checks if the value of day matches "Friday"
            case "Friday":
                // Prints "It is Friday" to the console
                System.out.println("It is Friday");
                // Exits the switch statement
                break;
            // Checks if the value of day matches "Saturday"
            case "Saturday":
                // Prints "It is Saturday" to the console
                System.out.println("It is Saturday");
                // Exits the switch statement
                break;
            // Runs as a backup if day doesn't match any of the days above
            default:
                // Prints the value of day followed by " is not a day"
                System.out.println(day + " is not a day");
                // Closes the switch statement block
        }
        // Closes the main method
    }
// Closes the Switches class
}