package com.nw.schooling.java_basics.lesson01;

// all previously used classes were provide by java.lang package that is imported by default to any Java class
// java.util package is also provided by Java itself but it's classes must be declared as imported, otherwise you can
// use them only if you specify their fully qualified name (FQN) in code
import java.util.Scanner;

public class HowAreYouWorld {

    public static void main(String[] args) {
        System.out.println("How are you world?");
        // As mentioned before, java.lang.System class has reference to system input stream, this stream can be read
        // in many ways but java.util.Scanner class provides really simple and useful API ready just to use
        Scanner scanner = new Scanner(System.in);
        // "nextLine" method reads all characters written to the stream until it reaches new line character, after
        // new line character is provided all characters are packed and returned as java.lang.String object that you
        // can use later
        String answer = scanner.nextLine();
        // String equality is decide by equals or equalsIgnoreCase method, the later one doesn't impeach characters'
        // case so it will decide "Good" and "good" and "gooD" as equal (thus returning true)
        if (answer.equalsIgnoreCase("good")) {
            System.out.println("I'm glad to hear that you are good");
        } else {
            System.out.println("I'm sad to hear that you are not good");
        }
    }

}
