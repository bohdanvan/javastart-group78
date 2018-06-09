package com.bvan.javastart.lessons7_8.practice;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class Zebra {

    public static void main(String[] args) {
        String[] zebra = createZebra(4);
        System.out.println(Arrays.toString(zebra)); // [black, white, black, white]

        System.out.println(Arrays.toString(createZebra(5))); // [black, white, black, white, black]
    }

    public static String[] createZebra(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("negative size");
        }

        String[] zebra = new String[size];
        for (int i = 0; i < zebra.length; i++) { // fori
            zebra[i] = (i % 2 == 0) ? "black" : "white";
        }
        return zebra;
    }

}
