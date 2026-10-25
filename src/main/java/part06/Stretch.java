package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4161s
//        rewatch 69:21–74:54 for if / else if / else, 76:36–80:18 for switch
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

import java.util.Scanner;

public class Stretch {
    public static void main(String[] args) {

        // ==========================================
        // STRETCH A — Guess First
        // ==========================================
        /* MY GUESS:
           B or better
           Medium
        */
        // Why my guess was wrong:
        // 1. For score = 85, Java checks conditions top to bottom and stops at the first true one (85 >= 70), so it prints "C or better" and never reaches the >= 80 check.
        // 2. For level = 2, there is no break statement after case 2, so after printing "Medium" it falls through and also runs case 3 ("Hard") before hitting a break.

        int score = 85;
        if (score >= 70) {
            System.out.println("C or better");
        } else if (score >= 80) {
            System.out.println("B or better");
        } else {
            System.out.println("Below C");
        }

        int level = 2;
        switch (level) {
            case 1:
                System.out.println("Easy");
            case 2:
                System.out.println("Medium");
            case 3:
                System.out.println("Hard");
                break;
            default:
                System.out.println("Unknown");
        }

        // ==========================================
        // STRETCH B — Weather, Seasons, and Battery
        // ==========================================

        // B1. Weather
        int temperature = 72;
        if (temperature >= 80) {
            System.out.println("Shorts weather");
        } else if (temperature >= 60) {
            System.out.println("Hoodie weather");
        } else {
            System.out.println("Coat weather");
        }

        // B2. Seasons
        int month = 4;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("That is not a month");
        }

        // B3. Battery
        Scanner scanner = new Scanner(System.in);
        System.out.print("Battery percent: ");
        int battery = scanner.nextInt();

        if (battery < 20) {
            System.out.println("Low battery. Go charge!");
        } else if (battery < 80) {
            System.out.println("Battery OK");
        } else {
            System.out.println("Fully charged");
        }

        scanner.close();
    }
}