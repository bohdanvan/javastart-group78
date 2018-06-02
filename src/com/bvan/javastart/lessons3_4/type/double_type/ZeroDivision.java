package com.bvan.javastart.lessons3_4.type.double_type;

/**
 * @author bvanchuhov
 */
public class ZeroDivision {

    public static void main(String[] args) {
        System.out.println(10.0 / 0); // Infinity
        System.out.println(-10.0 / 0); // -Infinity
        System.out.println(0.0 / 0); // NaN

        System.out.println("Hello");
    }
}
