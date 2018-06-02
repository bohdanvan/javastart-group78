package com.bvan.javastart.lessons5_6.triangle;

/**
 * @author bvanchuhov
 */
public class StrangeTrianglePrinter1 {

    public static void main(String[] args) {
        int size = 4;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}

//1
//2	2
//3	3	3
//4	4	4	4
