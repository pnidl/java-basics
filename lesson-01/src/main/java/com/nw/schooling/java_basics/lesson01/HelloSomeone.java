package com.nw.schooling.java_basics.lesson01;

public class HelloSomeone {

    public static void main(String[] args) {
        // all arrays have static reference for their length
        if (args.length > 0) {
            // accessing elements of array is done by their index (position in array)
            // in case of accessing nonexistent index, an exception is thrown, but exceptions will be discussed later
            // "name" is newly created variable of type "java.lang.String", JAVA is typed language that's why you can
            // only store String values in String variables
            String name = args[0];
            // string concatenation is done with "+" operator
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("There is nobody to accept my greetings :(");
        }
    }

}
