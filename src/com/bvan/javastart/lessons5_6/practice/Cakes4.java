package com.bvan.javastart.lessons5_6.practice;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class Cakes4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter cakes: ");
        int cakes = scanner.nextInt(); // 10

        System.out.print("Border cake: ");
        int borderCake = scanner.nextInt(); // 7

        System.out.println("I have " + cakes + " cakes.");

        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
            System.out.println("I have eaten " + cakeIndex + " cake.");

            if (cakeIndex > borderCake) {
                System.out.println("I'm feeling bad.");
            }
        }
    }
}
