package com.nw.schooling.java_basics.lesson01;

/**
 * @author Petr Nídl (petr.nidl@zf.com)
 * @since 2015-03-20
 */
public class HelloPeople {

    public static void main(String[] args) {
        if (args.length > 0) {
            StringBuilder sb = new StringBuilder("Hello, ");
            for (String name : args) {
                sb.append(name);
            }
            sb.append("!");
            System.out.println(sb.toString());
        } else {
            System.out.println("There is nobody to accept my greetings :(");
        }
    }

}
