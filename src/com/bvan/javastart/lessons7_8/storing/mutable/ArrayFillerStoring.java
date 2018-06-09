package com.bvan.javastart.lessons7_8.storing.mutable;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFillerStoring {

    public static void main(String[] args) {
        int[] a = new int[10];
        Arrays.fill(a, 42);
        System.out.println(Arrays.toString(a));
    }
}
