package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[20];

        int filler = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        // fori + Tab

        System.out.println(Arrays.toString(array));
    }
}
