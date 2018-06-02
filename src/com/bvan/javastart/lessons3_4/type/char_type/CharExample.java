package com.bvan.javastart.lessons3_4.type.char_type;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\\'; // \n, \t, \\, \', \"
        char c3 = '\u25B2';
        char c4 = 1000;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}
