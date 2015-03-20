package com.nw.schooling.java_basics.lesson01;

/**
 * @author Petr Nídl (petr.nidl@zf.com)
 * @since 2015-03-20
 */
public class HelloPeople {

    public static void main(String[] args) {
        if (args.length > 0) {
            // resulting string could be created by simple looped string concatenation but in this case
            // java.lang.StringBuilder class provides more effective (and correct) way (just believe me, later you can study how
            // strings are special in java)
            StringBuilder sb = new StringBuilder("Hello, ");
            // FOREACH loop is a simplified version of FOR loop, you don't specify any counter, you just state
            // that you want to iterate over all elements of given array and assign them as values of variable named
            // "name"
            for (String name : args) {
                // concatenation on StringBuilder is done by "append" method
                sb.append(name);
            }
            sb.append("!");
            // StringBuilder's result can be retrieved by calling "toString" method
            System.out.println(sb.toString());
        } else {
            System.out.println("There is nobody to accept my greetings :(");
        }
    }

}
