package com.nw.schooling.java_basics.lesson01;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        System.out.println("Are we there yet?");
        Scanner scanner = new Scanner(System.in);

        String answer;
        while(true) {
            answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("Yes")) {
                System.out.println("Yippee!");
                break;
            } else {
                System.out.println("And now?");
            }
        }
    }

}
