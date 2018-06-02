package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java!";

        int len = s.length();
        System.out.println(len); // 5

        System.out.println(2 * s.length());

        char ch = s.charAt(2);
        System.out.println(ch); // l

        char lastChar = s.charAt(s.length() - 1);
        System.out.println(lastChar);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
