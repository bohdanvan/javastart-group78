package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullExample {

    public static void main(String[] args) {
        String[] words = {"Java", "C++"};
        String s = find(words);
        if (s == null) {
            System.out.println("Elements is not found");
        } else {
            System.out.println(s);
        }
    }

    /**
     * Can return null.
     */
    public static String find(String[] words) {
        for (String word : words) {
            if (word.length() > 10) {
                return word;
            }
        }
        return null;
    }
}
