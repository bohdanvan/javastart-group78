package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayExample {

    public static void main(String[] args) {
        int[] array = new int[5];

        int len = array.length;
        System.out.println("len = " + len);

        array[2] = 10;
        array[array.length - 1] = 20;

        System.out.println(Arrays.toString(array)); // Output
    }
}
