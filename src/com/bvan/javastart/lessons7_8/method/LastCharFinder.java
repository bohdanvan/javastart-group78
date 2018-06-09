package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class LastCharFinder {

    public static void main(String[] args) {
        System.out.println(lastChar(""));
        System.out.println(lastChar("Java")); // a
        System.out.println(lastChar("H")); // H
    }

    public static char lastChar(String s) {
        if (s.isEmpty()) {
            throw new IllegalArgumentException("can't find last char for an empty string");
        }

        return s.charAt(s.length() - 1);
    }
}
