package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class SumMethod {

    public static void main(String[] args) {
        int x = sum(sum(1, 2), sum(30, 40));
        System.out.println(x);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
