package com.nw.schooling.java_basics.lesson01;

public class ICanCount {

    public static void main(String[] args) {
        if (args.length > 0) {
            String numberString = args[0];
            System.out.println("I can count to " + numberString + ", see:");
            int number = Integer.parseInt(numberString);
            for (int i = 0; i < number; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("I can count to potato");
        }
    }

}
