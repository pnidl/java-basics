package com.nw.schooling.java_basics.lesson01;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        System.out.println("Are we there yet?");
        Scanner scanner = new Scanner(System.in);

        String answer;
        // WHILE loop is more generic than FOR loop, it doesn't increment any counter and it repeats it's content
        // until it's condition returns "false" or until "break" or "return" statement is reached inside.
        // This actual statement represent (almost) infinite loop and is used widely
        while(true) {
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Yippee!");
                // exit the loop (in this case "return" could also be used because while statement is the last statement
                // of the program, but if there were any statements after they would become unreachable. "break" simply
                // exits the loop and continues with code execution after.
                break;
            } else {
                System.out.println("And now?");
            }
        }
    }

}
