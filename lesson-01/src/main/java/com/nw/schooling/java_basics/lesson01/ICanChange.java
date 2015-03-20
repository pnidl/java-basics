package com.nw.schooling.java_basics.lesson01;

public class ICanChange {

    public static void main(String[] args) {
        int i; // declaration
        i = 1; // definition
        // strings can be concatenated with other objects
        System.out.println("Initial: " + i);
        i = i + 1; // add 1 (also applies for other operators: -,*,/,%)
        System.out.println("Plus one: " + i);
        i += 1; // add 1 - shorter (also applies for other operators: -,*,/,%)
        System.out.println("Plus another one: " + i);
        i = 30; // redefinition
        System.out.println("Changed: " + i);
        i++; // increment
        System.out.println("Incremented: " + i);
        i--; // decrement
        System.out.println("Decremented: " + i);
    }

}
