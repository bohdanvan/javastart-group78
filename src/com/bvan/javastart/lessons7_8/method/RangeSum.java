package com.bvan.javastart.lessons7_8.method;

import sun.tools.jstat.Scale;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        System.out.println(rangeSum(3, 5)); // 12
        System.out.println(rangeSum(-10, -9)); // -19
        System.out.println(rangeSum(0, 100)); // 5050
    }

    public static int rangeSum(int from, int to) {
        if (from > to) {
            throw new IllegalArgumentException("'from' should be <= 'to'");
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }
        return sum;
    }


}
