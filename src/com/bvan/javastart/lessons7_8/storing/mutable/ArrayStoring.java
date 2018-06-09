package com.bvan.javastart.lessons7_8.storing.mutable;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayStoring {

    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        int[] b = a;

        b[0] = 1000;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
