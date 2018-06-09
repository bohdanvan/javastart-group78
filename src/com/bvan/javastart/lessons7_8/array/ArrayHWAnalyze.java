package com.bvan.javastart.lessons7_8.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayHWAnalyze {

    public static void main(String[] args) {
        // 1
        boolean[] booleans = new boolean[30];
        System.out.println(Arrays.toString(booleans));

        // 2
        double[] doubles = {10.2, 5.6, 7.8, 11.9};
        System.out.println(Arrays.toString(doubles));

        // 3
        int[] a1 = new int[10];
        int len = a1.length;
        System.out.println("len = " + len);

        // 4
        int[] a2 = {10, 30, 5};
        String s = Arrays.toString(a2);
        System.out.println(s);

        // 5
        int[] a3 = new int[20];
        Arrays.fill(a3, 42);
        System.out.println(Arrays.toString(a3));

        // 6
        int[] a4 = {10, 30, 5};
        Arrays.sort(a4);
        System.out.println(Arrays.toString(a4));
        System.out.println();

        // 7
        int[] a5 = {-10, 5, 0, 20, 30, -5};
        for (int i = 0; i < a5.length; i++) {
            if (a5[i] > 0) {
                System.out.println(i);
            }
        }
        System.out.println();

        // 8
        for (int i = 0; i < a5.length; i++) {
            int elem = a5[i];

            if (elem > 0) {
                System.out.println(elem);
            }
        }
        System.out.println();

        // for-each
        for (int elem : a5) {
            if (elem > 0) {
                System.out.println(elem);
            }
        }
        System.out.println();

        // 9
        for (int i = a5.length - 1; i >= 0; i--) {
            int elem = a5[i];

            if (elem > 0) {
                System.out.println(elem);
            }
        }
    }
}
