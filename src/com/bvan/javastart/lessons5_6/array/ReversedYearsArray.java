package com.bvan.javastart.lessons5_6.array;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ReversedYearsArray {

    public static void main(String[] args) {
        int[] years = new int[19];

        int filler = 2018;
        for (int i = 0; i < years.length; i++) {
            years[i] = filler;
            filler--;
        }

        System.out.println(Arrays.toString(years));
    }
}
