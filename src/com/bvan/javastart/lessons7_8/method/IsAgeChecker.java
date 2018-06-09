package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class IsAgeChecker {

    public static void main(String[] args) {
        System.out.println(isAge(10)); // true
        System.out.println(isAge(-20)); // false
        System.out.println(isAge(121)); // false
    }

    public static boolean isAge(int n) {
        return n >= 1 && n <= 120;
    }
}
