package com.nw.schooling.java_basics.lesson01;

public class ICanCount {

    public static void main(String[] args) {
        if (args.length > 0) {
            String numberString = args[0];
            System.out.println("I can count to " + numberString + ", see:");
            // strings can be parsed to basic data types
            int number = Integer.parseInt(numberString);
            // FOR loop represents repeated execution of it's content and simultaneously incrementing of counter "i"
            // "i" is just conventional name for FOR loops, it can be named in the same way as any other variable
            // this statement means: Do code mentioned in curly brackets while value of  variable "i" of type "int"
            // is less than value of "number" variable (also of type int). After each iteration, increment value of
            // "i" variable.
            for (int i = 0; i < number; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("I can count to potato");
        }
    }

}
