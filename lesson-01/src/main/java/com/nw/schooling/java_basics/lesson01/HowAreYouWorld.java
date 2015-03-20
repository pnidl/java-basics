package com.nw.schooling.java_basics.lesson01;

import java.util.Scanner;

public class HowAreYouWorld {

    public static void main(String[] args) {
        System.out.println("How are you world?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("good")) {
            System.out.println("I'm glad to hear that you are good");
        } else {
            System.out.println("I'm sad to hear that you are not good");
        }
    }

}
