package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTrianglePrinter2 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

//1	2	3	4
//1	2	3
//1	2
//1

