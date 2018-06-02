package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ForEachExample {

    public static void main(String[] args) {
        int[] array = {10, 30, 20};
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int elem = array[i];
            elem = 10;
            System.out.println(elem);
        }
        System.out.println();

        // for-each
        for (int elem : array) { // iter
            System.out.println(elem);
        }
        System.out.println();

    }
}
