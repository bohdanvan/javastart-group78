package com.bvan.javastart.lessons5_6.array;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 30, 20, 50};

        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
