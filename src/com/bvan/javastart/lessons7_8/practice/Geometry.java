package com.bvan.javastart.lessons7_8.practice;

/**
 * @author bvanchuhov
 */
public class Geometry {

    public static void main(String[] args) {
        double a1 = rectangleArea(10, 20);
        double a2 = rectangleArea(30, 40);
        double a3 = circleArea(10);

        System.out.println("a1 = " + a1); // 200
        System.out.println("a2 = " + a2); // 1200
        System.out.println("a3 = " + a3); // ~314
    }

    public static double rectangleArea(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("not positive size");
        }
        return width * height;
    }

    public static double circleArea(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("not positive radius");
        }
        return Math.PI * Math.pow(radius, 2);
    }
}
