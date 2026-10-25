package part07;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4895s
//        rewatch 81:35–87:47 for && || !, 89:29–91:54 for while
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// If your program never stops: click the red square (Stop) in the Run window.


import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {
        /* MY GUESS:
           true
           false
           true
           true
           count is 3
           count is 2
           count is 1
           done

           Why I was wrong on line 4: !(x == 7) is false because x == 7 is true, and ! flips true to false.
        */

        // Stretch A
        int x = 7;
        System.out.println(x > 5 && x < 10);
        System.out.println(x > 5 && x > 10);
        System.out.println(x < 5 || x == 7);
        System.out.println(!(x == 7));
        int count = 3;
        while (count > 0) {
            System.out.println("count is " + count);
            count = count - 1;
        }
        System.out.println("done");

        // Stretch B1 — Countdown
        int countdown = 5;
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown = countdown - 1;
        }
        System.out.println("Liftoff!");

        // Stretch B2 — Password check
        Scanner scanner = new Scanner(System.in);
        String password = "";
        while (!password.equals("java123")) {
            System.out.print("Password: ");
            password = scanner.next();
        }
        System.out.println("Access granted");

        // Stretch B3 — Number check (1 to 10)
        int number = 0;
        while (number < 1 || number > 10) {
            System.out.print("Pick a number from 1 to 10: ");
            number = scanner.nextInt();
        }
        System.out.println("You picked " + number);
    }
}