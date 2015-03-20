// package name - dot-delimited path to current file
package com.nw.schooling.java_basics.lesson01;

// class declaration (don't bother with "public" keyword now, access levels and visibility will be mentioned later)
// Class name MUST be the same as containing file name (without .java suffix) and SHOULD (it's a convention)
// start with capital letter.
public class HelloWorld {

    // Main method, the first one that is called when JVM starts
    // don't bother with "public static" keywords, access levels, visibility and class/instance members will
    // be mentioned later
    // String array parameter called "args" is mandatory and represents list of program arguments
    public static void main(String[] args) {
        // Class system has static reference to system output (out, err) and input (in) streams
        // Output streams are of type "java.io.PrintStream" that exposes "println" (and others) method
        // that prints given string followed with "\n" new line character
        System.out.println("Hello world!");
    }

}
