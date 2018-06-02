package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMin {

    public static void main(String[] args) {
        int[] array = {20, 10, 15, 30};

        int min = array[0];
        for (int elem : array) {
//            min = Math.min(min, elem);

            if (elem < min) {
                min = elem;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("min = " + min);
    }
}
