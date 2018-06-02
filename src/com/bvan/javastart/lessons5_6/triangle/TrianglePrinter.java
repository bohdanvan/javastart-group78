package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        for (int length = 1; length <= size; length++) {
            for (int n = 1; n <= length; n++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
