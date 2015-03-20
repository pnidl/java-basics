package com.nw.schooling.java_basics.lesson01;

public class HelloSomeone {

    public static void main(String[] args) {
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("There is nobody to accept my greetings :(");
        }
    }

}
