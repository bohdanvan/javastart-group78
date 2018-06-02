package com.bvan.javastart.lessons3_4.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class PersonIOFile {

    public static void main(String[] args) throws FileNotFoundException {
        // Input
        // 1. Create a scanner object
        // 2. Read input date with the scanner.
        // 3. Close the scanner.

        File file = new File("person.txt");
        Scanner scan = new Scanner(file);

        String name = scan.next();
        int age = scan.nextInt();

        scan.close(); // optional

        // BL
        String message = "Hello, I'm " + name + ", "
                + age + " years old";

        // Output
        System.out.println(message);
    }
}
