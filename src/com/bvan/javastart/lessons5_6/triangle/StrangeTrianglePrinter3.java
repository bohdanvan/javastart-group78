package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTrianglePrinter3 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = size; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

//1
//2	2
//3	3	3
//4	4	4	4
