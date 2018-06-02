package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitives (8)

        // 1. Integer
        byte b = 100; // (-) 1B, -128...127
        short s = 10000; // (-) 2B, -32 000 ... 32 0000
        int x = 1000000000; // (+) 4B, max = 2 000 000 000
        long l = 10000000000000000L; // (+)

        // 2. Floating Point
        float f = 10.5f; // (-) 4B
        double d = 10.5; // (+) 8B

        // 3. Character
        char c = 'a';

        // 4. Logical
        boolean bool = true;

        // Object
        String str = "Hello";
    }
}
