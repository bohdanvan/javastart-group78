package com.bvan.javastart.lessons7_8.method;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ArrayReader {

    public static void main(String[] args) {
        int[] a = readArray();
        System.out.println(Arrays.toString(a));
    }

    public static int[] readArray() {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
